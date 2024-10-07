 # Programa de supermercado
 ## clase producto
 - Primero creamos una clase abstracta Producto para poder usarlo en las demas clases hijas
 -  despues lo implementados con el metodo ComparableTo para comparar precios
 - Creamos en constructor de Producto(nombre y precio)
 - Ahora comparamos un precio con otro
 - Despues utilizamos como metodo toString() para sobreescribir las demas clases hijas
 
 ## clase Bebida 
 - Heredamos la clase abstracta de Producto a la clase bebida para usar sus metodos en este caso el metodo toString()
 - Creamos el atributo de litros de tipo double. 
 - reutilizamos los atributos de la clase Producto con super(nombre y precio) en el constructor de Bebida
 - Sobreescribimos con el metodo toString() -> nombre, litro y precio

 ## clase ProductoLimpieza
 - Heredamos la clase abstracta de Producto a la clase producto de limpieza para usar sus metodos es decir, el metodo toString()
 - Creamos el atributo contenido de tipo double(decimal de doble precision)
 - con el metodo super() traemos los atributos de la clase Producto nombre y precio
 - sobreescribimos con el metodo toString(), el nombre, contenido y precio en este caso

 ## clase Alimento 
 - Heredamos la clase abstracta de Producto a la clase alimento para disponer de sus metodos, el metodo toString()
 - Creamos el atributo para la unidad de ventas de cada alimento
 - disponemos de los atributos de la clase producto con el metodo super utilizando el nombre y precio ya definidos
 - sobreescribimos con el metodo toString(), nombre, unidad de venta y precio. 

## clase Principal Supermercado
- Creamos la clase principal para ejecutar la solucion en general 
- Creamos el metodo cargarProductos() es de tipo List<> de Producto
- Instanciamos con
```
    List<Producto> productos = new ArrayList<>();

```
- vamos agregando los productos a la lista
- retornamos productos ya cargados

### Main
--- 
 - instanciamos la lista de productos donde utilizamos el metodo de cargarProducto
- Imprimimos los productos con 
```  
productos.forEach(System.out::println);
```
- Ahora vamos a devolver el producto más caro y más barato usando ComparableTo
```
 Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);
```

- Ahora vamos a imprimir el producto mas caro y mas barato de las colecciones 
```
        System.out.println("=============================");
        System.out.println("Producto más caro: " + productoMasCaro.nombre);
        System.out.println("Producto más barato: " + productoMasBarato.nombre);


```





