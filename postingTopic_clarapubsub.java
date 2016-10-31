// Most of the methods throw exceptions based on error HTTP response, such as
// objects that already exist.
// Swallow the exceptions or check for existence
Topic createTopic(String topicName) throws IOException {
  String topic = getTopic(topicName);
  Pubsub.Projects.Topics topics = pubsub.projects().topics();
  ListTopicsResponse list = topics.list(proect).execute();
  if (list.getTopics() == || !List.getTopics().contains(new Topic().setName(topic))) {
      Topic newTopic = topics.create(topic, new Topic()).execute();
      return newTopic;
  } else {
    return new Topic().setName(topic);
  }
}
