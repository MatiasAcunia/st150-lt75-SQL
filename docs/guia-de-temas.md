# Guía breve de conceptos y recursos (consulta puntual)

No hace falta estudiar todo antes de empezar. Primero lee el ejercicio, intenta resolverlo y, si te falta una base concreta, consulta el recurso relacionado. Los enlaces no sustituyen los enunciados oficiales ni adelantan soluciones.

Recursos verificados: [MIT OCW 6.006: videos de algoritmos](https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-spring-2020/video_galleries/lecture-videos/), [VisuAlgo](https://visualgo.net/en), [Java Collections Framework](https://dev.java/learn/api/collections-framework/), [SQLBolt](https://sqlbolt.com/).

## Arrays
Explorar secuencias y su estado: índices, límites, duplicados, orden y coste de cada recorrido.
MIT: Lecture 2 (Data Structures and Dynamic Arrays).

## Hashing
HashSet guarda claves únicas; HashMap asocia claves con valores. Una función hash permite acceder en tiempo esperado cercano a O(1), sujeto a colisiones.
MIT: Lecture 4 (Hashing); Dev.java: sección Maps.

## Sliding Window and Two Pointers
Dos índices delimitan un intervalo; actualizar sus límites puede evitar recalcular todo el segmento.
Observa cómo evolucionan dos índices sobre ejemplos pequeños antes de optimizar.

## Binary Search
Sobre una propiedad monotónica o una secuencia ordenada, descartar la mitad del espacio de búsqueda en cada paso.
MIT: Lecture 1 y los ejemplos de búsqueda; prueba invariantes y límites.

## Strings
Tratar cadenas como secuencias; comprobar índices, caracteres Unicode cuando corresponda y construcción de resultados.
Antes de optimizar, fija la semántica de caracteres e índices en Java.

## Stack and Queues
Pila LIFO y cola FIFO: elegir según el orden en que se necesita recuperar información.
Dev.java: Collections Framework y jerarquía Queue.

## Linked List
Nodos enlazados mediante referencias; comprobar referencias nulas, cabeza y cola al insertar o eliminar.
VisuAlgo: Linked List; Java Collections Framework.

## Binary Trees
Cada nodo tiene hasta dos hijos; explorar recorridos DFS/BFS y condiciones de parada.
MIT: Lecture 6 (Binary Trees, Part 1).

## Binary Search Trees
Árbol con orden relativo entre subárboles; las operaciones dependen de su altura.
MIT: Lecture 6 y Lecture 7 (AVL).

## Heaps
Árbol completo con prioridad en la raíz, útil para mínimos/máximos dinámicos.
MIT: Lecture 8 (Binary Heaps).

## Recursion and Backtracking
Resolver subproblemas con estado y caso base; deshacer elecciones al explorar alternativas.
Dibuja árbol de decisiones y casos base para instancias pequeñas.

## Greedy Algorithms
Elegir una opción local y justificar por qué conserva la posibilidad de una solución global válida.
La decisión local exige una justificación; no basta con que funcione en los ejemplos.

## Graphs
Vértices y aristas modelan conexiones; usar listas de adyacencia, DFS/BFS y conjuntos de visitados.
MIT: Lectures 9-11 (BFS, DFS, Shortest Paths); VisuAlgo: Graph Traversal.

## Dynamic Programming
Identificar estados y transiciones, reutilizando subproblemas superpuestos con memoización o tabulación.
MIT: Lectures 15-18 (Dynamic Programming).

## Tries
Árbol de prefijos para búsquedas de palabras o secuencias; una arista representa una transición.
Dibuja un prefijo compartido y el indicador de fin de palabra.

## Bit Manipulation
Operaciones sobre bits, máscaras, XOR y desplazamientos; considerar ancho y signo.
Escribe números pequeños en binario y comprueba el efecto de cada operación.

## Mathematics
Usar propiedades matemáticas para reducir trabajo; comprobar extremos y posible desbordamiento.
Verifica límites del tipo numérico y propiedades usadas.

## SQL
Tablas, claves y relaciones antes de la consulta; FROM/JOIN y WHERE definen filas candidatas, GROUP BY/HAVING agrupan y filtran grupos. [SQLBolt: fundamentos y ejercicios](https://sqlbolt.com/) y [SQLBolt: JOIN](https://sqlbolt.com/lesson/6).

## Método de práctica
1. Lee entradas/salidas, restricciones y casos límite desde la página original.
2. Prueba ejemplos pequeños y diseña primero una solución correcta.
3. Tras un intento serio, consulta una pista a la vez; no copies editoriales ni soluciones.
4. Implementa en Java o SQL, valida en la plataforma y recién entonces guarda tu solución.
5. Reintenta sin ayuda los problemas difíciles unos días después.
