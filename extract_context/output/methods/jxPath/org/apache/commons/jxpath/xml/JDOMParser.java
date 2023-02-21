public Object parseXML(InputStream stream) { [EOL]     if (!isNamespaceAware()) { [EOL]         throw new JXPathException("JDOM parser configuration error. JDOM " + "does not support the namespaceAware=false setting."); [EOL]     } [EOL]     try { [EOL]         SAXBuilder builder = new SAXBuilder(); [EOL]         builder.setExpandEntities(isExpandEntityReferences()); [EOL]         builder.setIgnoringElementContentWhitespace(isIgnoringElementContentWhitespace()); [EOL]         builder.setValidation(isValidating()); [EOL]         return builder.build(stream); [EOL]     } catch (Exception ex) { [EOL]         throw new JXPathException("JDOM parser error", ex); [EOL]     } [EOL] } <line_num>: 32,49
