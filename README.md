# Ejercicio: Herencia y uso de super

## 📌 Descripción

Este ejercicio consiste en trabajar la **herencia en Java** mediante una clase principal llamada `Vehiculo` y dos subclases llamadas `Coche` y `Moto`.

Se utiliza `extends` para heredar atributos y métodos, y `super()` para llamar al constructor de la superclase y reutilizar sus métodos.

## ⚙️ Funcionamiento

Se crean tres clases:

- **Vehiculo:** contiene los atributos `marca`, `modelo` y `anio`, declarados como `protected`, y un constructor para inicializarlos.
- **Coche:** extiende de `Vehiculo` y añade el atributo `numeroPuertas`.
- **Moto:** extiende de `Vehiculo` y añade el atributo `cilindrada`.

Las subclases utilizan `super(...)` en sus constructores para inicializar los atributos heredados.

Cada clase tiene su propio método `mostrarInformacion()`. Las subclases utilizan `super.mostrarInformacion()` para mostrar primero la información del vehículo y después sus atributos específicos.

## 🔒 Método final

En la clase `Vehiculo` se añade el método:

```java
public final String descripcionCorta()
```

Este método devuelve la marca y el modelo del vehículo.

Se intenta sobrescribir temporalmente en `Coche`, pero se produce un error de compilación porque un método declarado como `final` no puede sobrescribirse en las clases hijas.

Después de comprobar el error, se elimina el intento de sobrescritura.

## 🧪 Clase de prueba: TestVehiculo

Se realizan las siguientes pruebas:

1. Crear un objeto `Coche` con su marca, modelo, año y número de puertas.
2. Crear un objeto `Moto` con su marca, modelo, año y cilindrada.
3. Mostrar la información de ambos vehículos mediante `mostrarInformacion()`.
4. Comprobar que las subclases reutilizan el método de la superclase.
5. Comprobar el funcionamiento de `descripcionCorta()`.

## 🔍 Conceptos importantes

- **Herencia (`extends`):** permite que una clase herede atributos y métodos de otra.
- **protected:** permite acceder a los atributos desde las subclases.
- **super():** llama al constructor de la superclase.
- **super.mostrarInformacion():** permite reutilizar el método de la clase padre.
- **final:** impide que un método sea sobrescrito por las clases hijas.

## ✅ Conclusión

Con este ejercicio se aprende a utilizar la herencia en Java, reutilizando código mediante una superclase y sus subclases.

También se practica el uso de `super()` y `super.mostrarInformacion()`, además de comprender que la palabra reservada `final` impide sobrescribir determinados métodos.
