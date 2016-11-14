package com.hahaeasy.easyfeign;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tonyxue on 11/13/16.
 */
public class GithubServiceTest {
	@Test
	public void makeRequest() throws Exception {

		GithubWhateverResponse response = new GithubService().makeRequest();

		Assert.assertNotNull(response.getId());

	}

}