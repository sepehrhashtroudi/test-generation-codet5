public void testDetection() throws Exception { [EOL]     final ArchiveStreamFactory factory = new ArchiveStreamFactory(); [EOL]     final ArchiveInputStream ar = factory.createArchiveInputStream(new BufferedInputStream(new FileInputStream(new File(getClass().getClassLoader().getResource("bla.ar").getFile())))); [EOL]     assertNotNull(ar); [EOL]     assertTrue(ar instanceof ArArchiveInputStream); [EOL]     final ArchiveInputStream tar = factory.createArchiveInputStream(new BufferedInputStream(new FileInputStream(new File(getClass().getClassLoader().getResource("bla.tar").getFile())))); [EOL]     assertNotNull(tar); [EOL]     assertTrue(tar instanceof TarArchiveInputStream); [EOL]     final ArchiveInputStream zip = factory.createArchiveInputStream(new BufferedInputStream(new FileInputStream(new File(getClass().getClassLoader().getResource("bla.zip").getFile())))); [EOL]     assertNotNull(zip); [EOL]     assertTrue(zip instanceof ZipArchiveInputStream); [EOL]     final ArchiveInputStream jar = factory.createArchiveInputStream(new BufferedInputStream(new FileInputStream(new File(getClass().getClassLoader().getResource("bla.jar").getFile())))); [EOL]     assertNotNull(jar); [EOL]     assertTrue(jar instanceof ZipArchiveInputStream); [EOL]     final ArchiveInputStream cpio = factory.createArchiveInputStream(new BufferedInputStream(new FileInputStream(new File(getClass().getClassLoader().getResource("bla.cpio").getFile())))); [EOL]     assertNotNull(cpio); [EOL]     assertTrue(cpio instanceof CpioArchiveInputStream); [EOL] } <line_num>: 33,71
