CollectionHolder(final T collection) { [EOL]     this.collection = collection; [EOL] } <line_num>: 56,58
@Test [EOL] @Ignore [EOL] public void testLinkedList() throws InterruptedException, ExecutionException { [EOL]     this.testConcurrency(new CollectionHolder<List<Integer>>(new LinkedList<Integer>())); [EOL] } <line_num>: 64,68
@Test [EOL] @Ignore [EOL] public void testArrayList() throws InterruptedException, ExecutionException { [EOL]     this.testConcurrency(new CollectionHolder<List<Integer>>(new ArrayList<Integer>())); [EOL] } <line_num>: 70,74
@Test [EOL] @Ignore [EOL] public void testCopyOnWriteArrayList() throws InterruptedException, ExecutionException { [EOL]     this.testConcurrency(new CollectionHolder<List<Integer>>(new CopyOnWriteArrayList<Integer>())); [EOL] } <line_num>: 76,80
@Override [EOL] public Integer call() { [EOL]     for (int i = 0; i < REPEAT; i++) { [EOL]         final String s = ReflectionToStringBuilder.toString(holder); [EOL]         Assert.assertNotNull(s); [EOL]     } [EOL]     return Integer.valueOf(REPEAT); [EOL] } <line_num>: 93,100
@Override [EOL] public Integer call() { [EOL]     for (int i = 0; i < DATA_SIZE; i++) { [EOL]         list.remove(list.get(0)); [EOL]     } [EOL]     return Integer.valueOf(REPEAT); [EOL] } <line_num>: 104,110
private void testConcurrency(final CollectionHolder<List<Integer>> holder) throws InterruptedException, ExecutionException { [EOL]     final List<Integer> list = holder.collection; [EOL]     for (int i = 0; i < DATA_SIZE; i++) { [EOL]         list.add(Integer.valueOf(i)); [EOL]     } [EOL]     final ExecutorService threadPool = Executors.newFixedThreadPool(2); [EOL]     final Callable<Integer> consumer = new Callable<Integer>() { [EOL]  [EOL]         @Override [EOL]         public Integer call() { [EOL]             for (int i = 0; i < REPEAT; i++) { [EOL]                 final String s = ReflectionToStringBuilder.toString(holder); [EOL]                 Assert.assertNotNull(s); [EOL]             } [EOL]             return Integer.valueOf(REPEAT); [EOL]         } [EOL]     }; [EOL]     final Callable<Integer> producer = new Callable<Integer>() { [EOL]  [EOL]         @Override [EOL]         public Integer call() { [EOL]             for (int i = 0; i < DATA_SIZE; i++) { [EOL]                 list.remove(list.get(0)); [EOL]             } [EOL]             return Integer.valueOf(REPEAT); [EOL]         } [EOL]     }; [EOL]     final Collection<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>(); [EOL]     tasks.add(consumer); [EOL]     tasks.add(producer); [EOL]     final List<Future<Integer>> futures = threadPool.invokeAll(tasks); [EOL]     for (final Future<Integer> future : futures) { [EOL]         Assert.assertEquals(REPEAT, future.get().intValue()); [EOL]     } [EOL] } <line_num>: 82,119