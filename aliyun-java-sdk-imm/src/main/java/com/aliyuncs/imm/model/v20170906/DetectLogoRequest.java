/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DetectLogoRequest extends RpcAcsRequest<DetectLogoResponse> {
	
	public DetectLogoRequest() {
		super("imm", "2017-09-06", "DetectLogo", "imm");
		setMethod(MethodType.POST);
	}

	private String project;

	private String srcUris;

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getSrcUris() {
		return this.srcUris;
	}

	public void setSrcUris(String srcUris) {
		this.srcUris = srcUris;
		if(srcUris != null){
			putQueryParameter("SrcUris", srcUris);
		}
	}

	@Override
	public Class<DetectLogoResponse> getResponseClass() {
		return DetectLogoResponse.class;
	}

}
