# Google Pub/Sub API

## Cloud Pub/Sub = Publish-Subscribe Channel and Competing Consumers

Google Pub/Sub API comes with a quota of 10,000 messages per second across up to 10,000 topics.  At the nucleus of the Google Cloud Pub/Sub is Publish-Subscribe Channel.  It delivers a single messages published to it to multiple subscribers.  One of the advantages of this pattern is that adding subscribers is side-effect free.  In reality, Google Cloud Pub/Sub API implements both the Publish-Subscribe Channel and Competing Consumer patterns.

Use cases for Pub/Sub API:
 * Balancing workload
 * Distributing event notifications
 * Logging to multiple systems
 * Data streaming
 
### Topics and Subscriptions

The Pub/Sub implementation separates the concepts of topic and subscription, only one of them will receive a message.  
 * []() Topics - represent the pub-sub aspect of the system: if multiple subscribers subscribe to the same topic, each of them    will receive a copy of the message published to the topic.
 
### REST API

 * Cloud Pub/Sub is accessed through a set of REST APIs.  Resource names for topics and subscriptions must follow the 
