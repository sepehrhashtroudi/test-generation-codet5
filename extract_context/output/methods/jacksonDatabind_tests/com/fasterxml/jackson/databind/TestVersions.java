public void testMapperVersions() { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     assertVersion(mapper); [EOL]     assertVersion(mapper.reader()); [EOL]     assertVersion(mapper.writer()); [EOL]     assertVersion(new JacksonAnnotationIntrospector()); [EOL] } <line_num>: 16,23
private void assertVersion(Versioned vers) { [EOL]     Version v = vers.version(); [EOL]     assertFalse("Should find version information (got " + v + ")", v.isUknownVersion()); [EOL]     Version exp = PackageVersion.VERSION; [EOL]     assertEquals(exp.toFullString(), v.toFullString()); [EOL]     assertEquals(exp, v); [EOL] } <line_num>: 31,38
