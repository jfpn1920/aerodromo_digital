<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:ED8B00,100:ED8B00&height=260&section=header&text=Aer%C3%B3dromo%20digital&desc=Bienvenidos%20usuarios%20a%20mi%20proyecto&fontSize=43&fontColor=ffffff&descSize=18&fontAlignY=38&descAlignY=58&animation=fadeIn"/>

<p align="justify">Este proyecto, llamado <b>aeródromo digital</b>, fue desarrollado en <b>java</b> como un ejercicio práctico para fortalecer la lógica de programación mediante la creación de un sistema de gestión de vuelos desde la consola. El programa cuenta con un menú principal de seis opciones que permite <b>registrar, editar, listar, buscar y eliminar</b> los vuelos almacenados. Cada vuelo almacena datos como el número de vuelo, la aerolínea, la ciudad de origen, la ciudad de destino, la hora de salida, la hora de llegada y el estado del vuelo, utilizando arreglos con una capacidad de <b>10 vuelos durante la ejecución</b>. Durante su desarrollo se aplicaron conceptos fundamentales de programación, como variables, arreglos, estructuras condicionales, ciclos repetitivos y estructuras de selección, además de procesos para modificar, eliminar y reorganizar registros. Este proyecto permite poner en práctica los conocimientos adquiridos en java y sirve como base para desarrollar sistemas de gestión más avanzados utilizando otros lenguajes y tecnologías.</p>

<h2 align="center">⚙️ Funcionamiento del menú principal</h2>

### ➕ Registrar vuelo

<p align="justify">La opción <b>1) registrar vuelo</b> permite añadir un nuevo vuelo al sistema. Al seleccionarla, el programa calcula el identificador del vuelo mediante la expresión <b>total + 1</b> y lo muestra en pantalla. Después, solicita el <b>número de vuelo, la aerolínea, la ciudad de origen, la ciudad de destino, la hora de salida, la hora de llegada y el estado del vuelo</b>, y guarda cada dato en la posición <b>total</b> de su respectivo arreglo. Finalmente, muestra el mensaje <b>"Vuelo registrado correctamente."</b> y aumenta la variable <b>total</b> en uno.</p>

### ✏️ Editar vuelo

<p align="justify">La opción <b>2) editar vuelo</b> permite modificar la información de un vuelo registrado. Primero, el programa comprueba si existen vuelos almacenados mediante la variable <b>total</b>. Si no hay registros, muestra el mensaje <b>"No existen vuelos registrados."</b>. En caso contrario, presenta una lista con el ID, el número de vuelo, la aerolínea, el origen, el destino, la hora de salida, la hora de llegada y el estado de cada vuelo. Después, solicita el ID del vuelo que se desea editar y comprueba que esté dentro del rango permitido mediante la condición <b>idBuscar &gt;= 1 y idBuscar &lt;= total</b>. Si la selección es válida, calcula la posición con <b>idBuscar - 1</b>, solicita los nuevos datos del vuelo y actualiza directamente los valores de los arreglos correspondientes. Finalmente, presenta el mensaje <b>"Vuelo actualizado correctamente."</b>. Si el ID no corresponde a un vuelo registrado, muestra el mensaje <b>"ID no encontrada."</b>.</p>

### 📋 Listar vuelos

<p align="justify">La opción <b>3) listar vuelos</b> permite visualizar todos los vuelos registrados actualmente. Antes de mostrar la información, el programa comprueba si la variable <b>total</b> es igual a cero. Si no existen registros, presenta el mensaje <b>"No existen vuelos registrados."</b>. Si hay vuelos disponibles, muestra el título <b>"Lista de vuelos"</b> y utiliza un ciclo <b>for</b> para recorrer los arreglos desde la primera posición hasta el número total de vuelos registrados. Durante el recorrido, muestra en una sola línea el ID, el número de vuelo, la aerolínea, el origen, el destino, la hora de salida, la hora de llegada y el estado de cada vuelo.</p>

### 🔎 Buscar vuelo

<p align="justify">La opción <b>4) buscar vuelo</b> permite localizar un vuelo mediante su ID. Primero, el programa comprueba si existen vuelos registrados. Si no hay registros, muestra el mensaje <b>"No existen vuelos registrados."</b>. En caso contrario, solicita el ID que se desea buscar y verifica que esté dentro del rango válido mediante la condición <b>idBusqueda &gt;= 1 y idBusqueda &lt;= total</b>. Si el ID es válido, calcula la posición con <b>idBusqueda - 1</b> y muestra el mensaje <b>"Datos del vuelo encontrado:"</b> junto con todos los datos del vuelo. Si el ID no corresponde a un vuelo registrado, presenta el mensaje <b>"ID no encontrada."</b>.</p>

### 🗑️ Eliminar vuelo

<p align="justify">La opción <b>5) eliminar vuelo</b> permite eliminar un vuelo registrado mediante su ID. Antes de comenzar, el programa comprueba que existan vuelos almacenados. Si el sistema está vacío, muestra el mensaje <b>"No existen vuelos registrados."</b>. Si hay registros disponibles, presenta una lista con los datos de cada vuelo. Después, solicita el ID del vuelo que se desea eliminar y verifica que la selección esté dentro del rango válido. Si el vuelo existe, calcula su posición y utiliza un ciclo <b>for</b> que desplaza una posición hacia atrás los datos de los vuelos posteriores en los siete arreglos. Posteriormente, disminuye la variable <b>total</b> en uno y muestra el mensaje <b>"Vuelo eliminado correctamente."</b>. Si el ID no corresponde a un vuelo registrado, informa mediante el mensaje <b>"ID no encontrada."</b>.</p>

### 🚪 Salir del menú principal

<p align="justify">La opción <b>6) salir</b> finaliza la ejecución del programa y muestra el mensaje <b>"Gracias por utilizar Aerodromo Digital."</b>. El menú principal se encuentra dentro de una estructura repetitiva <b>do-while</b>, que mantiene el programa en funcionamiento mientras se cumpla la condición <b>opcion != 6</b>. Cuando el usuario selecciona la opción 6, la condición deja de cumplirse, el ciclo termina y el programa cierra el objeto <b>Scanner</b> con <b>entrada.close()</b>.</p>

<h2 align="center">🧠 Temas aplicados en el proyecto</h2>

### 📦 Variables

<p align="justify">En este proyecto se utilizan variables para guardar la opción seleccionada en el menú, controlar la cantidad de vuelos registrados, recorrer los arreglos, calcular el identificador de cada vuelo, almacenar los ID que el usuario desea editar, buscar o eliminar y determinar la posición de cada vuelo dentro de los arreglos. Cada variable cumple una función específica dentro de las operaciones de gestión de vuelos.</p>

🔢 **opcion:** Almacena la opción seleccionada por el usuario en el menú principal.

📊 **total:** Almacena la cantidad actual de vuelos registrados y también indica la siguiente posición libre en los arreglos.

🆔 **id:** Almacena el identificador del vuelo que se está registrando, calculado como <b>total + 1</b>.

🔎 **idBuscar:** Almacena el ID del vuelo que se desea editar.

🔍 **idBusqueda:** Almacena el ID del vuelo que se desea buscar.

🗑️ **idEliminar:** Almacena el ID del vuelo que se desea eliminar.

📍 **posicion:** Almacena la posición del vuelo dentro de los arreglos, calculada restando uno al ID.

🔄 **i:** Funciona como contador en los ciclos <b>for</b> que recorren los arreglos.

### 🗃️ Arreglos

<p align="justify">En este proyecto se utilizan siete arreglos relacionados con los datos de cada vuelo. Cada arreglo tiene una capacidad de <b>10 posiciones</b> y utiliza el mismo índice para representar la información correspondiente a un mismo vuelo. Por ejemplo, los datos de un vuelo almacenado en la posición <b>1</b> se encuentran distribuidos entre <b>numerosVuelos[1], aerolineas[1], origenes[1], destinos[1], horasSalida[1], horasLlegada[1] y estados[1]</b>. Esta organización permite recorrer, buscar, modificar, mostrar y eliminar los vuelos de manera ordenada.</p>

✈️ **numerosVuelos[10]:** Almacena los números de vuelo.

🏢 **aerolineas[10]:** Almacena el nombre de la aerolínea de cada vuelo.

🛫 **origenes[10]:** Almacena la ciudad de origen de cada vuelo.

🛬 **destinos[10]:** Almacena la ciudad de destino de cada vuelo.

🕐 **horasSalida[10]:** Almacena la hora de salida de cada vuelo.

🕑 **horasLlegada[10]:** Almacena la hora de llegada de cada vuelo.

📌 **estados[10]:** Almacena el estado de cada vuelo.

### 🔀 Estructuras condicionales

<p align="justify">En este proyecto se utilizan las estructuras <b>if</b> y <b>else</b> para verificar si existen vuelos registrados antes de realizar determinadas operaciones, validar el ID seleccionado para editar, buscar o eliminar un vuelo y decidir si se muestra la lista de vuelos o el mensaje de que no existen registros. Estas condiciones permiten que el programa responda de manera diferente según el estado del sistema y el resultado de cada operación.</p>

### 🔄 Estructuras repetitivas

<p align="justify">En este proyecto se utilizan los ciclos <b>for</b> y <b>do-while</b>. Los ciclos <b>for</b> permiten recorrer los arreglos para mostrar los vuelos en las listas de editar, listar y eliminar. Durante la eliminación, también se utiliza un ciclo <b>for</b> para desplazar los datos de los vuelos posteriores una posición hacia atrás. Por otro lado, el ciclo <b>do-while</b> mantiene activo el menú principal para que el usuario pueda ejecutar diferentes operaciones antes de salir del programa.</p>

### 🎯 Estructura switch

<p align="justify">El programa evalúa el valor almacenado en la variable <b>opcion</b> y ejecuta el bloque de instrucciones correspondiente. Cada caso representa una operación específica del sistema: <b>registrar, editar, listar, buscar, eliminar o salir</b>. Cada bloque finaliza con la instrucción <b>break</b>. También se utiliza el bloque <b>default</b> para mostrar el mensaje <b>"Opcion no valida."</b> cuando el valor introducido no coincide con ninguna de las opciones definidas.</p>

### 🔢 Declaración de arreglos

<p align="justify">El programa declara los arreglos mediante la instrucción <b>new String[10]</b>, lo que establece la capacidad de cada uno en <b>10 posiciones</b>. Esto permite administrar hasta 10 vuelos durante la ejecución. La cantidad de posiciones ocupadas se controla mediante la variable <b>total</b>, por lo que las operaciones recorren únicamente los registros comprendidos entre la primera posición y el total actual de vuelos.</p>

### 🔄 Reorganización de registros

<p align="justify">Cuando se selecciona un vuelo para eliminarlo, el programa utiliza un ciclo <b>for</b> que comienza en la posición seleccionada y llega hasta <b>total - 1</b>. En cada repetición, los datos de la posición siguiente se copian sobre la posición actual en los siete arreglos: <b>numerosVuelos, aerolineas, origenes, destinos, horasSalida, horasLlegada y estados</b>. Después, la variable <b>total</b> disminuye en uno, por lo que la última posición queda fuera del rango de registros activos. De esta manera, los vuelos posteriores ocupan las posiciones disponibles sin dejar espacios vacíos entre los registros activos.</p>

<h2 align="center">¿Cómo se implementaron las operaciones crud en el proyecto?</h2>

<p align="justify">Las operaciones <b>crud</b> se implementaron mediante las opciones del menú principal, permitiendo administrar los vuelos registrados. La operación <b>crear</b> corresponde a <b>registrar vuelo</b>, donde se introducen los datos de un nuevo vuelo; <b>leer</b> se realiza mediante las opciones <b>listar vuelos y buscar vuelo</b>; <b>actualizar</b> corresponde a <b>editar vuelo</b>, donde se modifican los datos de un vuelo registrado; y <b>eliminar</b> se realiza mediante la opción <b>eliminar vuelo</b>. Estas operaciones utilizan variables, arreglos, condicionales y ciclos para gestionar la información almacenada temporalmente durante la ejecución del programa.</p>

<h2 align="center">Diagrama de flujo del proyecto</h2>

<img src="./aerodromo_digital.png" alt="diagrama de flujo de aerodromo digital" width="100%">

<h2 align="center">🛡️ Validaciones del programa</h2>

### 📭 No existen vuelos registrados

<p align="justify">Esta validación se utiliza en las opciones de <b>editar, listar, buscar y eliminar</b>. El programa comprueba si la variable <b>total</b> es igual a <b>0</b> y, si no existen vuelos registrados, muestra el mensaje <b>"No existen vuelos registrados."</b>. Esta comprobación evita continuar con las operaciones que necesitan información almacenada cuando el sistema está vacío.</p>

### 🔢 Selección de vuelos

<p align="justify">El programa utiliza las variables <b>idBuscar</b>, <b>idBusqueda</b> e <b>idEliminar</b> para identificar el vuelo que se desea editar, buscar o eliminar. Antes de realizar estas operaciones, comprueba que el número introducido sea mayor o igual a <b>1</b> y menor o igual al valor de <b>total</b>. Si la selección está fuera de ese rango, muestra el mensaje <b>"ID no encontrada."</b>. Esta validación evita modificar, consultar o eliminar posiciones que no corresponden a vuelos registrados.</p>

### ⚠️ Capacidad máxima de vuelos

<p align="justify">Los arreglos tienen una capacidad de <b>10 posiciones</b>, por lo que el sistema puede almacenar un máximo de 10 vuelos. Sin embargo, en el código actual la opción de registrar vuelo no comprueba si <b>total</b> ha llegado a ese límite. Por este motivo, al intentar registrar el vuelo número 11 se produce una excepción <b>ArrayIndexOutOfBoundsException</b> y el programa se cierra. Esta situación puede corregirse agregando la condición <b>total &lt; 10</b> antes de solicitar los datos del vuelo.</p>

### ⚠️ Opción inválida

<p align="justify">La estructura <b>switch</b> incluye el bloque <b>default</b>, que muestra el mensaje <b>"Opcion no valida."</b> cuando el usuario introduce un número que no corresponde a ninguna de las opciones definidas en el menú. Sin embargo, el programa lee la opción y los ID con <b>nextInt()</b>, por lo que si el usuario escribe un texto en lugar de un número, se produce una excepción <b>InputMismatchException</b> y el programa se cierra. Esta situación puede corregirse validando la entrada con <b>hasNextInt()</b>.</p>

<h2 align="center">🎯 Objetivo del proyecto</h2>

<p align="justify">El objetivo principal de este proyecto es fortalecer la <b>lógica de programación</b> mediante el desarrollo de un sistema de gestión de vuelos en <b>java</b>. A través de su construcción se busca aplicar los conocimientos adquiridos sobre variables, arreglos, estructuras condicionales, ciclos repetitivos y estructuras de selección, integrándolos para resolver un problema de manera organizada. Además, el proyecto permite comprender cómo registrar, consultar, modificar y eliminar información en una aplicación de consola, estableciendo una base para desarrollar sistemas de gestión más completos con otros lenguajes y tecnologías.</p>

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:ED8B00,100:ED8B00&height=110&section=footer&text=%C2%A9%202026%20%7C%20L%C3%B3gica%20de%20programaci%C3%B3n%20hecha%20en%20java%20%7C%20aer%C3%B3dromo%20digital&fontSize=14&fontColor=FFFFFF&fontAlignY=87.5"/>