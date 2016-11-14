package com.hahaeasy.easyfeign;

import feign.RequestLine;

/**
 * Created by tonyxue on 11/13/16.
 */


public interface Github {

	@RequestLine("GET /users/whatever")
	GithubWhateverResponse getWhatever();

}
