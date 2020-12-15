#Author: vestupinan@qvision.com.co
#language:es

Característica: Verificar que el usuario compra el vestido mas caro

  como un usuario de la tienda web
  quiero verificar el proceso de venta del sitio
  para comprar el vestido mas caro


  Esquema del escenario: comprar el vestido mas caro
    Dado El usuario quiere comprar el vestido mas caro
      | correoUsuario   | claveUsuario   |
      | <correoUsuario> | <claveUsuario> |
    Cuando el usuario quiere enviar el pago por correo
      | emailUsuario   | emailDestino   | claveDeUsuario   | asunto   | dato   |
      | <emailUsuario> | <emailDestino> | <claveDeUsuario> | <asunto> | <dato> |
    Entonces el usuario envia un correo Se envió el mensaje.

    Ejemplos:

      | correoUsuario                    | claveUsuario | emailUsuario                     | emailDestino                     | claveDeUsuario | asunto            | dato    |
      | pruebaqvisiondiciembre@gmail.com | 1234567890   | pruebaqvisiondiciembre@gmail.com | pruebaqvisiondiciembre@gmail.com | testqvision    | Factura de compra | enviado |

