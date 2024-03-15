/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.springdoc.demo.app1.sample1;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionTranslator {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionTranslator.class);

	@ExceptionHandler({ RuntimeException.class })
	// If you comment the next @ResponseStatus statement -> NOR displayed by SpringDoc
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<ErrorMessage> handleRunTimeException(RuntimeException e) {
		return error(HttpStatus.INTERNAL_SERVER_ERROR, e);
	}


	private ResponseEntity<ErrorMessage> error(HttpStatus status, Exception e) {
		LOGGER.error("Exception : ", e);
		return ResponseEntity.status(status).body(new ErrorMessage(UUID.randomUUID().toString(), e.getMessage()));
	}
}