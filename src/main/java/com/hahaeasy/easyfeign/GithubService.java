package com.hahaeasy.easyfeign;

import feign.Feign;
import feign.gson.GsonDecoder;

/**
 * Created by tonyxue on 11/13/16.
 */
public class GithubService {
	static final String GitHubHostUrl = "https://api.github.com";

	public GithubWhateverResponse makeRequest() {
		Github github = Feign.builder().decoder(new GsonDecoder())
				.target(Github.class, GitHubHostUrl);
		return github.getWhatever();
	}
}
