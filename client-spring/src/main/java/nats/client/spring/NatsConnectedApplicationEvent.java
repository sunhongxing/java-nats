/*
 *   Copyright (c) 2013 Mike Heath.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package nats.client.spring;

import nats.client.Nats;
import org.springframework.context.ApplicationEvent;

/**
 * This event gets published when a connection is opened to a NATS server.
 *
 * @author Mike Heath <elcapo@gmail.com>
 */
public class NatsConnectedApplicationEvent extends AbstractNatsApplicationEvent {

	public NatsConnectedApplicationEvent(Nats nats) {
		super(nats);
	}
}
