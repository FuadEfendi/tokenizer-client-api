package org.tokenizer.client.api;

import java.util.List;

import javax.management.Query;

public interface TokenizerClient {

    List<TokenizerDocument> execute(Query query) throws TooManyRecordsException, CommunicationFailureException;

}
