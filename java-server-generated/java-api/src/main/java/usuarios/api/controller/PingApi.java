/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.17-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package usuarios.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-25T18:07:01.946-03:00[America/Buenos_Aires]")
@Api(value = "ping", description = "the ping API")
public interface PingApi {

	@ApiOperation(value = "ping", nickname = "ping", notes = "", response = String.class, tags = { "Status", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@RequestMapping(value = "/ping", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<String> ping();

}
