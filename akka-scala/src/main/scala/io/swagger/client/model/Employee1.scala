/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Employee1 (
  /* Users first name */
  firstName: Option[String],
  /* Users last name */
  lastName: Option[String],
  /* Users email */
  email: Option[String],
  /* Unix timestamp of user posted to DB */
  joinDate: Option[String]
) extends ApiModel


