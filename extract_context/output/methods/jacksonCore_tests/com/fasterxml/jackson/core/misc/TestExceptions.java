public void testOriginalMesssage() { [EOL]     JsonProcessingException exc = new JsonParseException("Foobar", JsonLocation.NA); [EOL]     String msg = exc.getMessage(); [EOL]     String orig = exc.getOriginalMessage(); [EOL]     assertEquals("Foobar", orig); [EOL]     assertTrue(msg.length() > orig.length()); [EOL] } <line_num>: 9,16
