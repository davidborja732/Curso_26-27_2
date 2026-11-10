\# 🎯 Lotería de Ejercicios PSP (Concurrencia)



> Haz los ejercicios en orden. Cada bloque introduce conceptos nuevos que necesitarás en el siguiente.



\---



\# 🟢 Nivel 1 - Hilos básicos



\## Ejercicio 1



Crea un hilo que muestre 5 veces:



```text

Hola desde el hilo

```



con una pausa de 1 segundo entre mensajes.



\*\*Utiliza:\*\*



\- Runnable

\- Thread

\- sleep()



\---



\## Ejercicio 2



Crea dos hilos:



\*\*Hilo A\*\*

\- Imprime números del 1 al 10.



\*\*Hilo B\*\*

\- Imprime letras de la A a la J.



Observa cómo se mezclan ambas salidas.



\---



\## Ejercicio 3



Crea tres hilos:



\- Cocina

\- Limpieza

\- Compras



Cada uno debe mostrar:



```text

Iniciando tarea...

Terminando tarea...

```



con tiempos de espera aleatorios.



\---



\# 🟡 Nivel 2 - Join e Interrupciones



\## Ejercicio 4



Crea un hilo trabajador.



El hilo principal debe esperar a que termine utilizando:



```java

join();

```



\---



\## Ejercicio 5



Crea un hilo que cuente hasta 100.



Después de 2 segundos:



```java

interrupt();

```



Debes detenerlo correctamente.



\---



\## Ejercicio 6



Simula una descarga:



```text

0%

10%

20%

30%

...

100%

```



Permite cancelarla usando interrupciones.



\---



\# 🟠 Nivel 3 - Problemas de Concurrencia



\## Ejercicio 7



Crea un contador compartido.



Dos hilos ejecutan:



```java

contador++;

```



100000 veces cada uno.



\### Preguntas



\- ¿Sale siempre 200000?

\- ¿Por qué?



\---



\## Ejercicio 8



Crea una clase:



```java

CuentaBancaria

```



con los métodos:



```java

ingresar()

retirar()

```



Dos hilos deben operar simultáneamente sobre la misma cuenta.



Comprueba si aparecen inconsistencias.



\---



\## Ejercicio 9



Corrige el ejercicio anterior utilizando:



```java

synchronized

```



\---



\# 🔵 Nivel 4 - Secciones Críticas



\## Ejercicio 10



Simula una impresora compartida.



Hay 5 usuarios.



Solo puede imprimir uno cada vez.



Utiliza:



```java

synchronized

```



\---



\## Ejercicio 11



Máquina expendedora.



Stock inicial:



```text

20 productos

```



10 clientes intentan comprar.



Evita vender más productos de los disponibles.



\---



\## Ejercicio 12



Sistema de entradas de cine.



\- 50 entradas disponibles.

\- 100 clientes intentan comprarlas.



Evita vender entradas repetidas.



\---



\# 🟣 Nivel 5 - Semáforos



\## Ejercicio 13



Simula un aparcamiento.



\- 5 plazas.

\- 20 coches.



Usa:



```java

Semaphore

```



Solo pueden estar 5 coches dentro simultáneamente.



\---



\## Ejercicio 14



Simula una piscina.



\- 3 calles disponibles.

\- 15 nadadores.



Controla el acceso con semáforos.



\---



\## Ejercicio 15



Simula un restaurante.



\- 10 clientes.

\- 4 mesas.



Cuando una mesa se libera puede entrar otro cliente.



Usa:



```java

acquire();

release();

```



\---



\# 🔴 Nivel 6 - Productor Consumidor



\## Ejercicio 16



Implementa un buffer de tamaño 1.



\- Productor genera números.

\- Consumidor consume números.



Usa:



```java

wait();

notifyAll();

```



\---



\## Ejercicio 17



Modifica el ejercicio anterior.



Ahora el buffer debe almacenar:



```text

10 elementos

```



\---



\## Ejercicio 18



Simula una cocina de restaurante.



\### Productores



\- Cocineros



\### Consumidores



\- Camareros



Los pedidos deben pasar por un buffer compartido.



\---



\# ⚫ Nivel 7 - Deadlocks



\## Ejercicio 19



Crea dos cuentas:



```java

CuentaA

CuentaB

```



Dos hilos realizan transferencias cruzadas.



Provoca deliberadamente un:



```text

Deadlock

```



\---



\## Ejercicio 20



Corrige el deadlock del ejercicio anterior.



\---



\## Ejercicio 21



Simula dos recursos:



\- Impresora

\- Escáner



Varios hilos los utilizan simultáneamente.



Evita deadlocks.



\---



\# 🟤 Nivel 8 - Executors



\## Ejercicio 22



Ejecuta 20 tareas usando:



```java

ExecutorService

```



con:



```java

Executors.newFixedThreadPool(4);

```



\---



\## Ejercicio 23



Calcula multiplicaciones en paralelo.



Ejemplos:



```text

2x5

3x8

4x7

5x9

```



Utiliza:



```java

Callable

Future

```



\---



\## Ejercicio 24



Simula un sistema de corrección de exámenes.



\- 100 exámenes.

\- 5 profesores virtuales.



Usa ThreadPool.



\---



\# 🟠 Nivel 9 - Sincronización Avanzada



\## Ejercicio 25



Simula una carrera de Fórmula 1.



5 mecánicos preparan el coche.



El piloto no puede salir hasta que todos terminen.



Usa:



```java

CountDownLatch

```



\---



\## Ejercicio 26



Simula un lanzamiento espacial.



Fases:



\- Combustible.

\- Motores.

\- Navegación.



Solo cuando las tres terminan puede despegar.



\---



\# 🔥 Nivel 10 - Examen Difícil



\## Ejercicio 27



Sistema de aeropuerto.



Debe incluir:



\- Facturación → Semaphore

\- Equipajes → Productor/Consumidor

\- Embarque → CountDownLatch



Todo integrado.



\---



\## Ejercicio 28



Sistema bancario concurrente.



\### Requisitos



\- 100 cuentas.

\- 500 transferencias aleatorias.

\- Exclusión mutua.

\- Sin deadlocks.

\- Consistencia total.



\---



\## Ejercicio 29



Supermercado concurrente.



\### Debe tener



\- Clientes (Threads)

\- Cajas (Semaphore)

\- Reponedores (Productores)

\- Cajeros (Consumidores)



\---



\## Ejercicio 30 - Matrícula de Honor 🚀



Diseña una simulación completa de una estación espacial.



Debe incluir:



\- Threads

\- Runnable

\- join()

\- interrupt()

\- synchronized

\- Semaphore

\- CountDownLatch

\- Productor-Consumidor

\- ExecutorService

\- Deadlock controlado y resuelto

\- Gestión correcta de recursos



\---



\# 📊 Objetivo



| Nivel | Resultado |

|---------|---------|

| 1 - 10 | Aprobado |

| 11 - 20 | Notable |

| 21 - 26 | Sobresaliente |

| 27 - 30 | Nivel examen difícil |

| 30 completo | Matrícula de Honor |

