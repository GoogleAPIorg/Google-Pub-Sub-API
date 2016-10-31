// Authenticate using a private Key-value
private void createClient(String private_key_value, String email) throws IOException, GeneralSecurityException {
  HttpTransport transport = GoogleNetTranspor.newTrustedTransport();
  GoogleCredential credential = new GoogleCredential.Builder()
      .setTransport(transport)
      .setJsonFactory(JSON-FACTORY)
      .setServiceAccountScopes(PubSubScopes.all())
      .setServiceAccountId(email)
      .setServiceAccountPrivateKeyFormP12File(new File(private_key_file))
      .build();
  pubsub = new Pubsub.Builder(transport, JSON_FACTORY, credential)
      .setApplicationNames("clarapubsub")
      .build();
}
