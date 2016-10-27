# Google Pub/Sub API

## Cloud Pub/Sub = Publish-Subscribe Channel and Competing Consumers

Google Pub/Sub API comes with a quota of 10,000 messages per second across up to 10,000 topics.  At the nucleus of the Google Cloud Pub/Sub is Publish-Subscribe Channel.  It delivers a single message published to it to multiple subscribers.  One of the advantages of this pattern is that adding subscribers is side-effect free.  In reality, Google Cloud Pub/Sub API implements both the (Publish-Subscribe Channel)[http://www.enterpriseintegrationpatterns.com/patterns/messaging/PublishSubscribeChannel.html]
