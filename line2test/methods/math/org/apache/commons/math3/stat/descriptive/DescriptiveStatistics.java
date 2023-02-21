public DescriptiveStatistics() { [EOL] } <line_num>: 117,118
public DescriptiveStatistics(int window) throws MathIllegalArgumentException { [EOL]     setWindowSize(window); [EOL] } <line_num>: 127,129
public DescriptiveStatistics(double[] initialDoubleArray) { [EOL]     if (initialDoubleArray != null) { [EOL]         eDA = new ResizableDoubleArray(initialDoubleArray); [EOL]     } [EOL] } <line_num>: 139,143
public DescriptiveStatistics(DescriptiveStatistics original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 152,154
public void addValue(double v) { [EOL]     if (windowSize != INFINITE_WINDOW) { [EOL]         if (getN() == windowSize) { [EOL]             eDA.addElementRolling(v); [EOL]         } else if (getN() < windowSize) { [EOL]             eDA.addElement(v); [EOL]         } [EOL]     } else { [EOL]         eDA.addElement(v); [EOL]     } [EOL] } <line_num>: 164,174
public void removeMostRecentValue() throws MathIllegalStateException { [EOL]     try { [EOL]         eDA.discardMostRecentElements(1); [EOL]     } catch (MathIllegalArgumentException ex) { [EOL]         throw new MathIllegalStateException(LocalizedFormats.NO_DATA); [EOL]     } [EOL] } <line_num>: 181,187
public double replaceMostRecentValue(double v) throws MathIllegalStateException { [EOL]     return eDA.substituteMostRecentElement(v); [EOL] } <line_num>: 197,199
public double getMean() { [EOL]     return apply(meanImpl); [EOL] } <line_num>: 206,208
public double getGeometricMean() { [EOL]     return apply(geometricMeanImpl); [EOL] } <line_num>: 216,218
public double getVariance() { [EOL]     return apply(varianceImpl); [EOL] } <line_num>: 230,232
public double getPopulationVariance() { [EOL]     return apply(new Variance(false)); [EOL] } <line_num>: 241,243
public double getStandardDeviation() { [EOL]     double stdDev = Double.NaN; [EOL]     if (getN() > 0) { [EOL]         if (getN() > 1) { [EOL]             stdDev = FastMath.sqrt(getVariance()); [EOL]         } else { [EOL]             stdDev = 0.0; [EOL]         } [EOL]     } [EOL]     return stdDev; [EOL] } <line_num>: 250,260
public double getSkewness() { [EOL]     return apply(skewnessImpl); [EOL] } <line_num>: 268,270
public double getKurtosis() { [EOL]     return apply(kurtosisImpl); [EOL] } <line_num>: 278,280
public double getMax() { [EOL]     return apply(maxImpl); [EOL] } <line_num>: 286,288
public double getMin() { [EOL]     return apply(minImpl); [EOL] } <line_num>: 294,296
public long getN() { [EOL]     return eDA.getNumElements(); [EOL] } <line_num>: 302,304
public double getSum() { [EOL]     return apply(sumImpl); [EOL] } <line_num>: 310,312
public double getSumsq() { [EOL]     return apply(sumsqImpl); [EOL] } <line_num>: 319,321
public void clear() { [EOL]     eDA.clear(); [EOL] } <line_num>: 326,328
public int getWindowSize() { [EOL]     return windowSize; [EOL] } <line_num>: 337,339
public void setWindowSize(int windowSize) throws MathIllegalArgumentException { [EOL]     if (windowSize < 1 && windowSize != INFINITE_WINDOW) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE, windowSize); [EOL]     } [EOL]     this.windowSize = windowSize; [EOL]     if (windowSize != INFINITE_WINDOW && windowSize < eDA.getNumElements()) { [EOL]         eDA.discardFrontElements(eDA.getNumElements() - windowSize); [EOL]     } [EOL] } <line_num>: 355,369
public double[] getValues() { [EOL]     return eDA.getElements(); [EOL] } <line_num>: 380,382
public double[] getSortedValues() { [EOL]     double[] sort = getValues(); [EOL]     Arrays.sort(sort); [EOL]     return sort; [EOL] } <line_num>: 392,396
public double getElement(int index) { [EOL]     return eDA.getElement(index); [EOL] } <line_num>: 403,405
public double getPercentile(double p) throws MathIllegalStateException, MathIllegalArgumentException { [EOL]     if (percentileImpl instanceof Percentile) { [EOL]         ((Percentile) percentileImpl).setQuantile(p); [EOL]     } else { [EOL]         try { [EOL]             percentileImpl.getClass().getMethod(SET_QUANTILE_METHOD_NAME, new Class[] { Double.TYPE }).invoke(percentileImpl, new Object[] { Double.valueOf(p) }); [EOL]         } catch (NoSuchMethodException e1) { [EOL]             throw new MathIllegalStateException(LocalizedFormats.PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD, percentileImpl.getClass().getName(), SET_QUANTILE_METHOD_NAME); [EOL]         } catch (IllegalAccessException e2) { [EOL]             throw new MathIllegalStateException(LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD, SET_QUANTILE_METHOD_NAME, percentileImpl.getClass().getName()); [EOL]         } catch (InvocationTargetException e3) { [EOL]             throw new IllegalStateException(e3.getCause()); [EOL]         } [EOL]     } [EOL]     return apply(percentileImpl); [EOL] } <line_num>: 426,447
@Override [EOL] public String toString() { [EOL]     StringBuilder outBuffer = new StringBuilder(); [EOL]     String endl = "\n"; [EOL]     outBuffer.append("DescriptiveStatistics:").append(endl); [EOL]     outBuffer.append("n: ").append(getN()).append(endl); [EOL]     outBuffer.append("min: ").append(getMin()).append(endl); [EOL]     outBuffer.append("max: ").append(getMax()).append(endl); [EOL]     outBuffer.append("mean: ").append(getMean()).append(endl); [EOL]     outBuffer.append("std dev: ").append(getStandardDeviation()).append(endl); [EOL]     try { [EOL]         outBuffer.append("median: ").append(getPercentile(50)).append(endl); [EOL]     } catch (MathIllegalStateException ex) { [EOL]         outBuffer.append("median: unavailable").append(endl); [EOL]     } [EOL]     outBuffer.append("skewness: ").append(getSkewness()).append(endl); [EOL]     outBuffer.append("kurtosis: ").append(getKurtosis()).append(endl); [EOL]     return outBuffer.toString(); [EOL] } <line_num>: 456,476
public double apply(UnivariateStatistic stat) { [EOL]     return eDA.compute(stat); [EOL] } <line_num>: 483,486
public synchronized UnivariateStatistic getMeanImpl() { [EOL]     return meanImpl; [EOL] } <line_num>: 496,498
public synchronized void setMeanImpl(UnivariateStatistic meanImpl) { [EOL]     this.meanImpl = meanImpl; [EOL] } <line_num>: 507,509
public synchronized UnivariateStatistic getGeometricMeanImpl() { [EOL]     return geometricMeanImpl; [EOL] } <line_num>: 517,519
public synchronized void setGeometricMeanImpl(UnivariateStatistic geometricMeanImpl) { [EOL]     this.geometricMeanImpl = geometricMeanImpl; [EOL] } <line_num>: 528,531
public synchronized UnivariateStatistic getKurtosisImpl() { [EOL]     return kurtosisImpl; [EOL] } <line_num>: 539,541
public synchronized void setKurtosisImpl(UnivariateStatistic kurtosisImpl) { [EOL]     this.kurtosisImpl = kurtosisImpl; [EOL] } <line_num>: 550,552
public synchronized UnivariateStatistic getMaxImpl() { [EOL]     return maxImpl; [EOL] } <line_num>: 560,562
public synchronized void setMaxImpl(UnivariateStatistic maxImpl) { [EOL]     this.maxImpl = maxImpl; [EOL] } <line_num>: 571,573
public synchronized UnivariateStatistic getMinImpl() { [EOL]     return minImpl; [EOL] } <line_num>: 581,583
public synchronized void setMinImpl(UnivariateStatistic minImpl) { [EOL]     this.minImpl = minImpl; [EOL] } <line_num>: 592,594
public synchronized UnivariateStatistic getPercentileImpl() { [EOL]     return percentileImpl; [EOL] } <line_num>: 602,604
public synchronized void setPercentileImpl(UnivariateStatistic percentileImpl) throws MathIllegalArgumentException { [EOL]     try { [EOL]         percentileImpl.getClass().getMethod(SET_QUANTILE_METHOD_NAME, new Class[] { Double.TYPE }).invoke(percentileImpl, new Object[] { Double.valueOf(50.0d) }); [EOL]     } catch (NoSuchMethodException e1) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD, percentileImpl.getClass().getName(), SET_QUANTILE_METHOD_NAME); [EOL]     } catch (IllegalAccessException e2) { [EOL]         throw new MathIllegalArgumentException(LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD, SET_QUANTILE_METHOD_NAME, percentileImpl.getClass().getName()); [EOL]     } catch (InvocationTargetException e3) { [EOL]         throw new IllegalArgumentException(e3.getCause()); [EOL]     } [EOL]     this.percentileImpl = percentileImpl; [EOL] } <line_num>: 617,635
public synchronized UnivariateStatistic getSkewnessImpl() { [EOL]     return skewnessImpl; [EOL] } <line_num>: 643,645
public synchronized void setSkewnessImpl(UnivariateStatistic skewnessImpl) { [EOL]     this.skewnessImpl = skewnessImpl; [EOL] } <line_num>: 654,657
public synchronized UnivariateStatistic getVarianceImpl() { [EOL]     return varianceImpl; [EOL] } <line_num>: 665,667
public synchronized void setVarianceImpl(UnivariateStatistic varianceImpl) { [EOL]     this.varianceImpl = varianceImpl; [EOL] } <line_num>: 676,679
public synchronized UnivariateStatistic getSumsqImpl() { [EOL]     return sumsqImpl; [EOL] } <line_num>: 687,689
public synchronized void setSumsqImpl(UnivariateStatistic sumsqImpl) { [EOL]     this.sumsqImpl = sumsqImpl; [EOL] } <line_num>: 698,700
public synchronized UnivariateStatistic getSumImpl() { [EOL]     return sumImpl; [EOL] } <line_num>: 708,710
public synchronized void setSumImpl(UnivariateStatistic sumImpl) { [EOL]     this.sumImpl = sumImpl; [EOL] } <line_num>: 719,721
public DescriptiveStatistics copy() { [EOL]     DescriptiveStatistics result = new DescriptiveStatistics(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 728,733
public static void copy(DescriptiveStatistics source, DescriptiveStatistics dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.eDA = source.eDA.copy(); [EOL]     dest.windowSize = source.windowSize; [EOL]     dest.maxImpl = source.maxImpl.copy(); [EOL]     dest.meanImpl = source.meanImpl.copy(); [EOL]     dest.minImpl = source.minImpl.copy(); [EOL]     dest.sumImpl = source.sumImpl.copy(); [EOL]     dest.varianceImpl = source.varianceImpl.copy(); [EOL]     dest.sumsqImpl = source.sumsqImpl.copy(); [EOL]     dest.geometricMeanImpl = source.geometricMeanImpl.copy(); [EOL]     dest.kurtosisImpl = source.kurtosisImpl; [EOL]     dest.skewnessImpl = source.skewnessImpl; [EOL]     dest.percentileImpl = source.percentileImpl; [EOL] } <line_num>: 743,762
