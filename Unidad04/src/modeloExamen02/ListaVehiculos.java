package modeloExamen02;

import java.util.ArrayList;

public class ListaVehiculos {

		//La clase que va a contener la lista de todos los coches
		ArrayList <Vehiculo> listaVehiculos;
		
		//La lista que va a contener a aquellos coches con un porcentaje de recargo premium superior al 12%
		ArrayList <Vehiculo> listaVehiculosPremium;
		
		//CONSTRUCTORES
		ListaVehiculos(){
			listaVehiculos = new ArrayList<>();
			listaVehiculosPremium = new ArrayList<>();
		}
		
		ListaVehiculos(ArrayList <Vehiculo> listaVehiculos, ArrayList <Vehiculo> listaVehiculosPremium){
			this.listaVehiculos = listaVehiculos;
			this.listaVehiculosPremium = listaVehiculosPremium;
		}
		
		/**
		 * Anade un objeto coche a la lista
		 * @param coche
		 * @return True si este se ha podido anadir, y false si no ha podido ser
		 */
		public boolean anadirVehiculo(Vehiculo coche) {
			boolean vehiculoAnadido = false;
			
			if(listaVehiculos.add(coche)) {
				vehiculoAnadido = true;
			};
			
			return vehiculoAnadido;
		}
		
		/**
		 * Muestra la lista que contiene todos los vehiculos
		 * @return la porpia lista listaVehiculos
		 */
		ArrayList <Vehiculo> listarTodos() {
			return listaVehiculos;
		}
		
		/**
		 * Busca un coche a partr de su matricula
		 * @param matricula
		 * @return El objeto vehiculo, o null en caso de que no encuentre la matricula en la lista
		 */
		public Object buscarPorMatricula(String matricula) {
			Object vehiculoEncontrado = null;
			
			//Recorremos la lista en busca del coche cuya matricula tenemos
			for (Vehiculo v : listaVehiculos) {
				if (v.getMatricula().equalsIgnoreCase(matricula)) {
					vehiculoEncontrado = v;
				}
			}
			
			return vehiculoEncontrado;
		}
		
		/**
		 * Modifica la cantidad de dias que se ha alquilado un coche
		 * @param matricula
		 * @param dias
		 * @return True si se han podido modificar los dias, false si no
		 */
		public boolean modificarDiasAlquilados(String matricula, int dias) {
			boolean diasModificados = false;
			
			//Si se encuentra la matricula en la lista, se podran modificar los dias
			for (Vehiculo v : listaVehiculos) {
				if (v.getMatricula().equalsIgnoreCase(matricula)) {
					v.setDiasAlquilados(dias);
					diasModificados = true;
				}
			}
			
			return diasModificados;
		}
		
		/**
		 * Modifica el porcentje de recargo premium que tiene un coche
		 * @param matricula
		 * @param porcentaje
		 * @return True si se ha podido modificar dicho porcentaje, false si no
		 */
		public boolean modificarRecargoPremium(String matricula, double porcentaje) {
			boolean recargoModificado = false;
			
			//Si se encuentra la matricula en la lista, se podra modificar el porcentaje de recargo
			for (Vehiculo v : listaVehiculos) {
				if (v.getMatricula().equalsIgnoreCase(matricula)) {
					v.setPorcentajePremium(porcentaje);
					recargoModificado = true;
				}
			}
			
			return recargoModificado;
		}
		
		/**
		 * Elimina un coche si su matricula se encuentra en la lista
		 * @param matricula
		 * @return True si se ha podido eliminar el coche, false si no
		 */
		public boolean eliminarPorMatricula(String matricula) {
			//Si se encuentra la matricula insertada, se eliminara al coche de la lista
			return listaVehiculos.removeIf(cualquierMatricula -> cualquierMatricula.getMatricula().equalsIgnoreCase(matricula));
		}
		
		/**
		 * Calcula la suma total de los recargos premium de todos los vehiculos
		 * @return El valor de esa suma
		 */
		public double calcularIngresoTotalRecargos() {
			//La suma de todos los recargos
			double sumaTotal = 0;
			
			//Se recorre toda la lista con el objetivo de sumar todos los recargos premium de esta
			for (Vehiculo v : listaVehiculos) {
				sumaTotal += v.recargoPremium(v.getPrecioPorDia(), v.getPrecioSeguro());
			}
			
			return sumaTotal;
		}
		
		/**
		 * Devuelve una lista con los coches cuyo porcentaje premium sea mayor al 12%
		 * @return La propia lista con dichos coches
		 */
		ArrayList <Vehiculo> listarVehiculosPremium(){
			//Si un vehiculo de la listaVehiculos tiene un porcentaje mayor al 12%, se anadira a la listaVehiculosPremium
			for (Vehiculo v : listaVehiculos) {
				if (v.getPorcentajePremium() > 0.12) {
					listaVehiculosPremium.add(v);
				}
			}
			
			return listaVehiculosPremium;
		}

	}
