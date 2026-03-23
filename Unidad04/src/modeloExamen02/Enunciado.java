package modeloExamen02;

public class Enunciado {
//	Gestión de Alquiler de Vehículo:
//	
//	Una empresa de alquiler de vehículos quiere informatizar la gestión de su flota.
//	Para ello, se desea desarrollar una aplicación que permita almacenar información de los vehículos, modificar sus datos y obtener cierta información económica sobre ellos.
//
//		Debes implementar una clase llamada Vehiculo, que tendrá los siguientes atributos:
//		matricula – Identificador único del vehículo
//	
//		modelo – Nombre comercial del vehículo
//
//		precio base por día – Precio base del alquiler diario
//	
//		porcentaje de recargo premium – Recargo aplicado a ciertos vehículos (0-25%)
//	
//		precio seguro diario – Coste del seguro adicional por día (atributo común a todos los vehículos)
//	
//		días alquilados – Número de días que el vehículo ha sido alquilado
//	
//	
//		----- Métodos de la clase Vehiculo -----
//		Debes decidir e implementar los métodos necesarios para que la clase sea flexible y esté bien diseñada:
//		
// 		- Constructores: decide cuáles son necesarios
//		- Getters y setters: solo los necesarios según una encapsulación correcta
//		- Método que devuelva el importe del recargo premium
//		- Fórmula: precio base por día × porcentaje recargo / 100
//		- Método que devuelva el importe total del seguro
//		- Fórmula: días alquilados × precio seguro diario
//		- Método que devuelva el ingreso total generado por el vehículo
//		- Fórmula: precio base + recargo premium + seguro
//		- Método que, al imprimir el objeto, muestre un formato personalizado como este:
//			1234ABC - Toyota Corolla
//			Precio Base/Día: 45.0 | Recargo Premium: 4.5 (10%)
//			Días alquilado: 6 | Total generado: 64.5
//		- Dos vehículos serán iguales si tienen la misma matrícula
//		- Método que retorne true si el porcentaje de recargo premium es superior al 12%
//	
//	
//		----- Clase ListaVehiculos -----
//		Esta clase gestionará una colección de vehículos y deberá incluir, al menos, los siguientes métodos:
//		
//		- anadirVehiculo(Vehiculo v)
//		Retorna true si se añade correctamente
//		- listarTodos()
//		 Muestra todos los vehículos con su información
	
//		- buscarPorMatricula(String matricula)
//		 Retorna el vehículo si existe, null en caso contrario
	
//		- modificarDiasAlquilados(String matricula, int dias)
//		 Retorna true si consigue modificar el dato
	
//		- modificarRecargoPremium(String matricula, double porcentaje)
//		 Retorna true si consigue modificar el dato
	
//		- eliminarPorMatricula(String matricula)
//		 Retorna true si consigue eliminarlo
	
//		- calcularIngresoTotalRecargos()
//		 Retorna la suma total de los recargos premium de todos los vehículos
	
//		- listarVehiculosPremium()
//		 Muestra los vehículos cuyo recargo premium sea superior al 12%
//	
//		----- Clase Principal ------
//		La aplicación debe incluir una clase principal con un menú interactivo que permita al usuario trabajar con el sistema.
	
//		Opciones del menú:
//			1. Añadir vehículo
//			2. Listar vehículos
//			3. Buscar vehículo por matrícula
//			4. Modificar días alquilados
//			5. Modificar recargo premium
//			6. Modificar precio seguro diario
//			7. Eliminar vehículo
//			8. Ver estadísticas
//			9. Salir
	
	
	
//		Comportamiento de cada opción
//		1. Añadir vehículo
//		Pedir matrícula, modelo, precio base por día y porcentaje de recargo premium
//		Validar que la matrícula no exista ya
//		Mostrar mensajes claros de éxito o error
	
//		2. Listar vehículos
//		Mostrar todos los vehículos con sus datos completos
//		3. Buscar vehículo por matrícula
//		Pedir la matrícula
//		Mostrar la información del vehículo si existe
//		Si no existe, informar adecuadamente
	
//		4. Modificar días alquilados
//		Pedir matrícula y nuevo valor
//		Validar que el vehículo exista
//		Mostrar mensaje indicando si la operación se realizó correctamente
	
//		5. Modificar recargo premium
//		Pedir matrícula y nuevo porcentaje
//		Validar que el vehículo exista
//		Validar que el porcentaje esté en el rango 0-25%
	
//		6. Modificar precio seguro diario
//		Este valor afecta a todos los vehículos
//		Pedir el nuevo precio y actualizarlo
//		Mostrar confirmación del cambio
	
//		7. Eliminar vehículo
//		Pedir matrícula
//		Confirmar la eliminación
//		Mostrar mensajes claros
	
//		8. Ver estadísticas
//		Mostrar:
//		Ingreso total obtenido por recargos premium
//		Listado de vehículos premium
	
//		9. Salir
//		Finalizar la ejecución mostrando el mensaje: “Gracias por usar el sistema. ¡Hasta pronto!”
	
	
	
	
//		----- Requisitos adicionales ------
//		La interacción se realizará mediante consola.
//		Deben validarse, al menos, los casos más importantes indicados en el enunciado.
//		El programa debe poder ejecutarse correctamente sin errores.
//		Se valorará el uso adecuado de:
//	
//	
//		clases
//		objetos
//		encapsulación
//		equals
//		toString
//		atributos estáticos
//		gestión de colecciones o arrays según lo trabajado en clase

}
