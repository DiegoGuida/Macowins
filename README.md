# Macowins

Requerimientos: 
•	El precio de venta de una prenda
•	El tipo de una prenda
•	Registrar las ventas de prendas
•	Saber las ganancias de un determinado día.

Descarte la alternativa de separar el Tipo y el Estado en dos interfaces diferentes. 
Descarte hacer una interfaz para Tipo con las clases (Sacos, Pantalones y Camisas) porque no tienen comportamiento diferente. Por lo tanto use un Enum dentro de Prenda y si se agregan más habría que agregarlas en el enum. 
Tambien descarte la opción de realizar otra interfaz para Estado, si bien tiene comportamiento diferente, el comportamiento no es muy diferente. Si el cliente informaría que el estado de una prenda podría variar o se podrían sumar mas estados o el comportamiento de cada estado se vuelve muy complejo de calcular, creo que ahí conviene mas que estén en una interfaz Estado con una clase separada de cada Estado (Nueva, Promoción, Liquidación, las que se agreguen) y separar el comportamiento de la prenda según el Estado en el que se encontrarían.
