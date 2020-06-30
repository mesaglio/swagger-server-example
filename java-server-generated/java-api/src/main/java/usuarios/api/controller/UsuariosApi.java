/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.17-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package usuarios.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import usuarios.api.models.Usuario;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-25T18:07:01.946-03:00[America/Buenos_Aires]")
@Api(value = "usuarios", description = "the usuarios API")
public interface UsuariosApi {

	@ApiOperation(value = "Actualizar usuario por username", nickname = "actualizarUsuarioByUsername", notes = "", response = Usuario.class, tags = {
			"Usuarios", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Usuario.class),
			@ApiResponse(code = 404, message = "Not found") })
	@RequestMapping(value = "/usuarios/{username}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PATCH)
	ResponseEntity<Usuario> actualizarUsuarioByUsername(
			@ApiParam(value = "Usuario", required = true) @Valid @RequestBody Usuario body,
			@ApiParam(value = "", required = true) @PathVariable("username") String username);

	@ApiOperation(value = "Crear usuario", nickname = "crearUsuario", notes = "", tags = { "Usuarios", })
	@ApiResponses(value = { @ApiResponse(code = 201, message = "OK"),
			@ApiResponse(code = 405, message = "Input invalido") })
	@RequestMapping(value = "/usuarios", consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Void> crearUsuario(@ApiParam(value = "Usuario", required = true) @Valid @RequestBody Usuario body);

	@ApiOperation(value = "Eliminar usuario por username", nickname = "eliminarUsuarioByUsername", notes = "", tags = {
			"Usuarios", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 404, message = "Not found") })
	@RequestMapping(value = "/usuarios/{username}", method = RequestMethod.DELETE)
	ResponseEntity<Void> eliminarUsuarioByUsername(
			@ApiParam(value = "", required = true) @PathVariable("username") String username);

	@ApiOperation(value = "Obtener usuario por username", nickname = "obtenerUsuarioByUsername", notes = "", response = Usuario.class, tags = {
			"Usuarios", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Usuario.class),
			@ApiResponse(code = 404, message = "Not found") })
	@RequestMapping(value = "/usuarios/{username}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<Usuario> obtenerUsuarioByUsername(
			@ApiParam(value = "", required = true) @PathVariable("username") String username);

	@ApiOperation(value = "Todos los usuario", nickname = "obtenerUsuarios", notes = "", response = Usuario.class, responseContainer = "List", tags = {
			"Usuarios", })
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "OK", response = Usuario.class, responseContainer = "List"),
			@ApiResponse(code = 405, message = "Input invalido") })
	@RequestMapping(value = "/usuarios", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<Usuario>> obtenerUsuarios();

}