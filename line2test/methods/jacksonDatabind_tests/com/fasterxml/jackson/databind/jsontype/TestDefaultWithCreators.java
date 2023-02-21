@JsonCreator [EOL] public UrlJob(@JsonProperty("id") long id, @JsonProperty("url") String url, @JsonProperty("count") int count) { [EOL]     this.id = id; [EOL]     this.url = url; [EOL]     this.count = count; [EOL] } <line_num>: 27,34
public String getUrl() { [EOL]     return url; [EOL] } <line_num>: 36,36
public int getCount() { [EOL]     return count; [EOL] } <line_num>: 37,37
public void testWithCreators() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL); [EOL]     UrlJob input = new UrlJob(123L, "http://foo", 3); [EOL]     String json = mapper.writeValueAsString(input); [EOL]     assertNotNull(json); [EOL]     Job output = mapper.readValue(json, Job.class); [EOL]     assertNotNull(output); [EOL]     assertSame(UrlJob.class, output.getClass()); [EOL]     UrlJob o2 = (UrlJob) output; [EOL]     assertEquals(123L, o2.id); [EOL]     assertEquals("http://foo", o2.getUrl()); [EOL]     assertEquals(3, o2.getCount()); [EOL] } <line_num>: 46,60