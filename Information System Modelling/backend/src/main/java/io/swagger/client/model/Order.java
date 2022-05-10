/*
 * Surfing/kiting spot
 * Restful API for management of Surfing/kitting spot.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.OrderItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Order
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-03T23:35:29.473682+02:00[Europe/Warsaw]")
public class Order {
  @SerializedName("partnerName")
  private String partnerName = null;

  @SerializedName("stage")
  private BigDecimal stage = null;

  @SerializedName("status")
  private BigDecimal status = null;

  @SerializedName("type")
  private BigDecimal type = null;

  @SerializedName("deliveryDate")
  private String deliveryDate = null;

  @SerializedName("direction")
  private BigDecimal direction = null;

  @SerializedName("items")
  private List<OrderItems> items = new ArrayList<OrderItems>();

  public Order partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

   /**
   * Get partnerName
   * @return partnerName
  **/
  @Schema(required = true, description = "")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public Order stage(BigDecimal stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @Schema(description = "")
  public BigDecimal getStage() {
    return stage;
  }

  public void setStage(BigDecimal stage) {
    this.stage = stage;
  }

  public Order status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Order type(BigDecimal type) {
    this.type = type;
    return this;
  }

   /**
   * Type of order. 1 for purchase, 2 for rent
   * @return type
  **/
  @Schema(description = "Type of order. 1 for purchase, 2 for rent")
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public Order deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Direction of order. If seller is the tenant 1, else 2
   * @return deliveryDate
  **/
  @Schema(required = true, description = "Direction of order. If seller is the tenant 1, else 2")
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Order direction(BigDecimal direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(required = true, description = "")
  public BigDecimal getDirection() {
    return direction;
  }

  public void setDirection(BigDecimal direction) {
    this.direction = direction;
  }

  public Order items(List<OrderItems> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(required = true, description = "")
  public List<OrderItems> getItems() {
    return items;
  }

  public void setItems(List<OrderItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.partnerName, order.partnerName) &&
        Objects.equals(this.stage, order.stage) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.type, order.type) &&
        Objects.equals(this.deliveryDate, order.deliveryDate) &&
        Objects.equals(this.direction, order.direction) &&
        Objects.equals(this.items, order.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerName, stage, status, type, deliveryDate, direction, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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