package com.fourTL.validation;

import java.util.List;

public class AccountValidate {
	public boolean isNullOrEmpty(String string) {
		return (string.isEmpty() || string == null)?true:false;
	}
	public boolean listIsNullOrEmpty(List<String> list) {
		return (list.isEmpty()|| list==null)?true:false;
	}
}