public void testJarMarker() throws IOException { [EOL]     File testArchive = File.createTempFile("jar-aostest", ".jar"); [EOL]     JarArchiveOutputStream out = null; [EOL]     ZipFile zf = null; [EOL]     try { [EOL]         out = new JarArchiveOutputStream(new FileOutputStream(testArchive)); [EOL]         out.putArchiveEntry(new ZipArchiveEntry("foo/")); [EOL]         out.closeEntry(); [EOL]         out.putArchiveEntry(new ZipArchiveEntry("bar/")); [EOL]         out.closeEntry(); [EOL]         out.close(); [EOL]         out = null; [EOL]         zf = new ZipFile(testArchive); [EOL]         ZipArchiveEntry ze = zf.getEntry("foo/"); [EOL]         assertNotNull(ze); [EOL]         ZipExtraField[] fes = ze.getExtraFields(); [EOL]         assertEquals(1, fes.length); [EOL]         assertTrue(fes[0] instanceof JarMarker); [EOL]         ze = zf.getEntry("bar/"); [EOL]         assertNotNull(ze); [EOL]         fes = ze.getExtraFields(); [EOL]         assertEquals(0, fes.length); [EOL]     } finally { [EOL]         if (out != null) { [EOL]             try { [EOL]                 out.close(); [EOL]             } catch (IOException e) { [EOL]             } [EOL]         } [EOL]         ZipFile.closeQuietly(zf); [EOL]         if (testArchive.exists()) { [EOL]             testArchive.delete(); [EOL]         } [EOL]     } [EOL] } <line_num>: 33,69