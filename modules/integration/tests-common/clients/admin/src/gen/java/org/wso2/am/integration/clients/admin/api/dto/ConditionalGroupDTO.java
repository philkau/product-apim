/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.admin.api.dto.ThrottleConditionDTO;
import org.wso2.am.integration.clients.admin.api.dto.ThrottleLimitTypeDTO;

/**
 * ConditionalGroupDTO
 */

public class ConditionalGroupDTO {
  @SerializedName("description")
  private String description = null;

  @SerializedName("conditions")
  private List<ThrottleConditionDTO> conditions = new ArrayList<>();

  @SerializedName("limit")
  private ThrottleLimitTypeDTO limit = null;

  public ConditionalGroupDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the Conditional Group
   * @return description
  **/
  @ApiModelProperty(value = "Description of the Conditional Group")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConditionalGroupDTO conditions(List<ThrottleConditionDTO> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ConditionalGroupDTO addConditionsItem(ThrottleConditionDTO conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Individual throttling conditions. They can be defined as either HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition Please see schemas of each of those throttling condition in Definitions section. 
   * @return conditions
  **/
  @ApiModelProperty(example = "\"[\\n  {\\n    \\\"type\\\": \\\"HEADERCONDITION\\\",\\n    \\\"headerCondition\\\":\\n    {\\n      \\\"invertCondition\\\": false,\\n      \\\"headerName\\\": \\\"Host\\\",\\n      \\\"headerValue\\\": \\\"10.100.7.77\\\"\\n    }\\n\\t},\\n\\t{\\n    \\\"type\\\": \\\"IPCONDITION\\\",\\n    \\\"ipCondition\\\":\\n    {\\n      \\\"invertCondition\\\": false,\\n      \\\"ipConditionType\\\": \\\"IPSPECIFIC\\\",\\n      \\\"specificIP\\\": \\\"10.100.1.22\\\",\\n      \\\"startingIP\\\": null,\\n      \\\"endingIP\\\": null\\n    }\\n\\t},\\n\\t{\\n    \\\"type\\\": \\\"QUERYPARAMETERCONDITION\\\",\\n    \\\"queryParameterCondition\\\":\\n    {\\n      \\\"invertCondition\\\": false,\\n      \\\"parameterName\\\": \\\"name\\\",\\n      \\\"parameterValue\\\": \\\"admin\\\"\\n    }\\n\\t},\\n\\t{\\n    \\\"type\\\": \\\"JWTCLAIMSCONDITION\\\",\\n    \\\"jwtClaimsCondition\\\":\\n    {\\n      \\\"invertCondition\\\": true,\\n      \\\"claimUrl\\\": \\\"claimUrl0\\\",\\n      \\\"attribute\\\": \\\"claimAttr0\\\"\\n    }\\n  }\\n]\\n\"", required = true, value = "Individual throttling conditions. They can be defined as either HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition Please see schemas of each of those throttling condition in Definitions section. ")
  public List<ThrottleConditionDTO> getConditions() {
    return conditions;
  }

  public void setConditions(List<ThrottleConditionDTO> conditions) {
    this.conditions = conditions;
  }

  public ConditionalGroupDTO limit(ThrottleLimitTypeDTO limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "")
  public ThrottleLimitTypeDTO getLimit() {
    return limit;
  }

  public void setLimit(ThrottleLimitTypeDTO limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalGroupDTO conditionalGroup = (ConditionalGroupDTO) o;
    return Objects.equals(this.description, conditionalGroup.description) &&
        Objects.equals(this.conditions, conditionalGroup.conditions) &&
        Objects.equals(this.limit, conditionalGroup.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, conditions, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

