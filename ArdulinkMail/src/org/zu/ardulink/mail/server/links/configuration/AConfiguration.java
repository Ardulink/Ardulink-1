/**
Copyright 2013 Luciano Zu project Ardulink http://www.ardulink.org/

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author Luciano Zu
*/

package org.zu.ardulink.mail.server.links.configuration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * [ardulinktitle] [ardulinkversion]
 * 
 * @author Luciano Zu project Ardulink http://www.ardulink.org/
 * 
 * [adsense]
 *
 */
@XmlRootElement(name="configuration")
public class AConfiguration {

	private AConnectionList aConnectionList;
	private ALinkList aLinkList;
	private ACommandList aCommandList;
	
	@XmlElement(name="aConnectionList")
	public AConnectionList getaConnectionList() {
		return aConnectionList;
	}
	public void setaConnectionList(AConnectionList aConnectionList) {
		this.aConnectionList = aConnectionList;
	}

	@XmlElement(name="aLinkList")
	public ALinkList getaLinkList() {
		return aLinkList;
	}
	public void setaLinkList(ALinkList aLinkList) {
		this.aLinkList = aLinkList;
	}

	@XmlElement(name="aCommandList")
	public ACommandList getaCommandList() {
		return aCommandList;
	}
	public void setaCommandList(ACommandList aCommandList) {
		this.aCommandList = aCommandList;
	}
	
}
