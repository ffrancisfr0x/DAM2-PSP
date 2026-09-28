# Apuntes de Threads en Java

## 1. Heredar de Thread

Consiste en crear una clase que herede de `Thread` y sobrescribir el método `run()`.

### Ejemplo

```java
class UD02_ThreadsJava.MiHilo extends Thread {

    @Override
    public void run() {
        System.out.println("Hola desde un hilo");
    }
}
```

### Ejecución

```java
import UD02_ThreadsJava.UD02_ThreadsJava.MiHilo;

UD02_ThreadsJava.MiHilo hilo = new UD02_ThreadsJava.MiHilo();
hilo.

start();
```

### Uso

- Ejemplos sencillos.
- Aprendizaje de concurrencia.
- Proyectos pequeños.

---

## 2. Implementar Runnable

Consiste en crear una clase que implemente la interfaz `Runnable`.

### Ejemplo

```java
class UD02_ThreadsJava.MiTarea implements Runnable {

    @Override
    public void run() {
        System.out.println("Hola desde Runnable");
    }
}
```

### Ejecución

```java
import UD02_ThreadsJava.UD02_ThreadsJava.MiTarea;

UD02_ThreadsJava.MiTarea tarea = new UD02_ThreadsJava.MiTarea();
Thread hilo = new Thread(tarea);

hilo.

start();
```

### Uso

- Aplicaciones reales.
- Mejor separación entre tarea e hilo.
- Método más utilizado profesionalmente.

---

## 3. Runnable mediante Lambda

Permite crear la tarea sin necesidad de una clase adicional.

### Ejemplo

```java
Thread hilo = new Thread(() -> {
    System.out.println("Hola desde Lambda");
});
```

### Ejecución

```java
hilo.start();
```

### Uso

- Tareas simples.
- Código más limpio y corto.
- Muy utilizado junto con programación concurrente moderna.

---

# Métodos importantes

## start()

Inicia un nuevo hilo.

```java
hilo.start();
```

---

## run()

Contiene el código que ejecutará el hilo.

```java
@Override
public void run() {
    // Código del hilo
}
```

---

## sleep()

Pausa la ejecución durante un tiempo determinado.

```java
Thread.sleep(1000);
```

1000 milisegundos = 1 segundo.

---

## join()

Hace que un hilo espere a que otro termine.

```java
hilo.start();
hilo.join();

System.out.println("El hilo ha terminado");
```

---

# Comparativa

Thread:
- Fácil de aprender.
- Menos flexible.

Runnable:
- Más flexible.
- Más utilizado profesionalmente.

Lambda:
- Más compacta.
- Ideal para tareas cortas.

---

# Resumen

✅ Thread → para aprender y ejemplos sencillos.

✅ Runnable → opción recomendada para proyectos reales.

✅ Lambda → versión moderna y corta de Runnable.

✅ start() crea un nuevo hilo.

✅ run() contiene la tarea que ejecutará el hilo.

✅ sleep() pausa la ejecución.

✅ join() espera a que un hilo termine.

✅ El orden de ejecución de los hilos no está garantizado.