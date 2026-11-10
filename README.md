# Grupo-5
Basede datos: Microsoft SQL Server 2019 (RTM) - 15.0.2000.5 (X64)   Sep 24 2019 13:48:23   Copyright (C) 2019 Microsoft Corporation  Express Edition (64-bit) on Windows 10 Pro 10.0 <X64> (Build 19045: ) (Hypervisor) 


PLANIFICACION DE CATEDRA - BASES DE DATOS I (TUP 2026)
DIVISION DE UNIDADES POR EXAMEN PARCIAL

PRIMER PARCIAL (UNIDADES 1 Y 2)
Fundamentos conceptuales y modelado de datos

UNIDAD 1 - Introduccion a las Bases de Datos y Sistemas Gestores

- Conceptos de datos, informacion y bases de datos.
- Sistemas Gestores de Bases de Datos Relacionales (SGBDR): definicion, caracteristicas, ventajas y usuarios.
- Enfoque de bases de datos.
- Modelos de datos. Esquemas y ejemplares.
- Arquitectura ANSI/SPARC e independencia de datos.
- Lenguajes de un SGBD: SDL, VDL, DDL y DML.
- Clasificacion de los Sistemas Gestores de Bases de Datos.
- Organizacion de archivos en un SGBD (introduccion).

UNIDAD 2 - Modelo Conceptual de Datos

- Modelo Entidad-Relacion.
- Entidades, atributos y relaciones.
- Restricciones estructurales: cardinalidad y participacion.
- Entidades debiles.
- Especializacion, generalizacion y restricciones de especializacion.
- Agregacion.

SEGUNDO PARCIAL (UNIDADES 3 Y 4)
Modelo relacional, normalizacion y acceso mediante SQL Server

UNIDAD 3 - Modelo Relacional
- Relaciones, atributos, tuplas y dominios.
- Claves y restricciones de integridad.
- Normalizacion (Primera, Segunda y Tercera Forma Normal).
- Transformacion del Modelo Entidad-Relacion al Modelo Relacional.

UNIDAD 4 - Lenguajes de Acceso a Bases de Datos Relacionales

- Introduccion al Algebra Relacional.
- Introduccion a un Sistema Gestor de Bases de Datos Relacional.
- Lenguaje SQL: DDL y DML.
- Definicion, manipulacion y consulta de datos.
- Consultas simples y multitabla, funciones, agrupamiento, subconsultas 
y manejo de valores NULL.
- Concepto de vistas y procedimientos almacenados simples.
- Implementacion de restricciones de integridad.
- Transacciones y acceso concurrente.
______________________________________________________________

TRABAJO PRACTICO INTEGRADOR
[![Ver Enunciado PDF](https://img.shields.io/badge/ENUNCIADO-TPI_PDF-blue?style=for-the-badge&logo=adobeacrobatreader&logoColor=white)](./TPI_BD_2026.pdf)
FLUJO PROFESIONAL CON GIT Y GITHUB PARA EL TPI DE BD I


¿CÓMO SERÍA EL ESQUEMA DE RAMAS (BRANCHING STRATEGY)?

Para un proyecto de base de datos y software, aplicar un flujo profesional basado en ramas es ideal. Nos permite mantener el código ordenado y evitar romper la versión estable.
Una estructura limpia y estándar para este tipo de TPI sería:
1. Rama `main` (o `master`):
   - Es la versión oficial, final y limpia del sistema. 
   - Contiene el script SQL definitivo que funciona sin errores y el PDF del trabajo listo para entregar.
   - Nadie escribe directo acá salvo cuando se está 100% seguro de que todo compila y corre bien.

2. Rama `dev` (Desarrollo):
   - Es el tronco donde se integra todo lo que se va construyendo.
   - Acá vas probando cómo encajan las tablas, las restricciones y las consultas de las funcionalidades juntas.

3. Ramas de características (`feature/` o ramas personales como `feature/consultas`, `feature/ddl`):
   - Si alguno quiere aportar algo o quiere probar una consulta compleja (por ejemplo, la de stock por sucursal o los pagos pendientes), creamos una rama específica para eso (`feature/funcionalidad-3`).
   - Una vez que anda, hacemos un Pull Request (PR) hacia `dev`.

VENTAJAS DE USAR ESTE ENFOQUE PROFESIONAL

- Historial limpio: Si una consulta con `GROUP BY` y subconsultas anidadas te rompe el resultado o da error en SQL Server, podés ver el historial exacto de los commits y volver atrás en segundos.
- Demostración en el coloquio: Es una manera de organizar un proyecto profesional.


JUSTIFICACION TECNICA Y DOCUMENTAL: CONTROL DE VERSIONES Y SEGURIDAD

OBJETIVO DEL BLOQUEO DE LA RAMA PRINCIPAL (MAIN / MASTER)

Se implementan políticas estrictas de protección sobre la rama principal (`main`/`master`) en el repositorio central de Git. Esta medida tiene como propósito garantizar la estabilidad, la integridad y la trazabilidad del código fuente y de los scripts de base de datos a lo largo del ciclo de vida del proyecto integrador.
 -------------------------------------------------------------

CRITERIOS Y JUSTIFICACION OPERATIVA

1. CONTROL DE CAMBIOS Y PREVENCION DE INCIDENTES:
   - Se restringen los aportes mediante inserciones directas (push sin filtro) sobre el tronco principal de desarrollo. 
   - Todo cambio o incorporación de código debe canalizarse a través de ramas de trabajo independientes y un mecanismo formal de revisión (Pull Request), minimizando el riesgo de sobreescrituras accidentales, pérdida de datos o   inconsistencias en los esquemas DDL y DML de SQL Server.

2. TRAZABILIDAD Y VALIDACION PREVIA:
   - Permite verificar la correcta ejecución de los scripts relacionales, las restricciones de integridad referencial y las consultas solicitadas antes de ser integradas en la versión definitiva de entrega.

3. ESTANDARIZACION DEL FLUJO DE TRABAJO:
   - Asegura que la documentación y los entregables técnicos que se presenten en la instancia de coloquio reflejen un entorno controlado, cumpliendo con las buenas prácticas profesionales de gestión de software y control de versiones.


ENTORNO DE TRABAJO, UNIFICACIÓN Y CLONACIÓN DE POYECTO DE BASE DE DATOS

PASO A PASO DESDE QUE RECIBEN LA INVITACIÓN AL REPOSITORIO

1. ACEPTAR LA INVITACIÓN
- Reales/revisan su bandeja de entrada (o notificaciones de GitHub).
- Abren el correo de invitación a la organización `Concesionaria-Parana` o al repositorio `Grupo-5`.
- Hacen clic en el botón **Join organization** o **Accept invitation**.

2. CREAR LA CARPETA ‘’workSpace’ EN EL DSICO C
CRAER EN EL DISCO: C/ (SUELTA), LA CARPETA (‘wordSpace’)
Abrir Git Bash
Escribir dentro cd “/c/workSpace” o cd c:/workSpace
O

Entrar a;
https://github.com/Concesionaria-Parana
Luego Repositories
Grupo 5

3. CLONAR EL REPOSITORIO

- Entran a GitHub, van al repositorio `Grupo-5`, hacen clic en el botón verde `<> Code` y copian la URL HTTPS.
- Ejecutan en su terminal:
  ```bash
  git clone https://github.com/Concesionaria-Parana/Grupo-5.git

4. CONFIGURAR LA RAMA DE DESARROLLO (DEV)

Entran a la carpeta recién descargada:
cd Grupo-5
 
Crean y se cambian a la rama de desarrollo suya propia para empezar a programar:
git checkout -b <nombre de su rama>
RECUERDO PARA EL EQUIPO:
Nunca deben subir cambios directo a la rama principal (master) ya que está protegida. Deben subir sus aportes a ramas secundarias o a dev y abrir un Pull Request para que vos lo revises y apruebes.

CÓMO PEDIR QUE SE SUBA UN CAMBIO A LA RAMA PRINCIPAL (MAIN)

¿QUÉ ES UN PULL REQUEST (PR)?
Como la rama principal (`main`) está protegida para que nadie rompa el código, los cambios no se suben de forma directa. Para llevar tu código de la rama `dev` (o de tu rama de trabajo) a `main`, tenés que crear y solicitar lo que en GitHub se llama un **Pull Request (PR)**. 
Esto le avisa al administrador (en este caso, vos o quien tenga los permisos) que hay mejoras listas para ser revisadas e integradas.

PASO A PASO PARA PEDIRLO DESDE GITHUB
1.	SUBIR TU RAMA LOCAL A GITHUB:
   Antes de hacer el pedido, asegurate de haber subido tu rama de trabajo a la plataforma ejecutando en tu terminal:
   ```bash
   git push origin <nombre-de-tu-rama>

2.	ENTRAR AL REPOSITORIO
Entrá a la página web del repositorio en GitHub [Grupo-5](https://github.com/Concesionaria-Parana/Grupo-5 ) 

3. IR A LA PESTAÑA DE PULL REQUESTS
Hacé clic en la pestaña **Pull requests** ubicada en el menú superior del repositorio
4. CREAR NUEVO PULL REQUEST
Hacé clic en el botón verde **New pull request**.
5. SELECCIONAR LAS RAMAS (BASE Y COMPARE)
- **base:** seleccioná `main` (que es a donde querés que llegue el código).
- **compare:** seleccioná tu rama (por ejemplo, `dev` o tu rama `feature/...`).
GitHub te mostrará automáticamente si los cambios son compatibles y no hay 
conflictos ("Able to merge").
5. REDACTAR EL PEDIDO
- Poné un título claro que indique qué se está agregando (por ejemplo: 
  "Implementación del script DDL de la base de datos").
- Escribí una breve descripción de lo que resolviste.

6. FINALIZAR
Hacé clic en el botón verde **Create pull request**.
¿QUÉ PASA DESPUÉS?

Una vez creado el pedido, el responsable del proyecto (elige a un miembro) 
revisará los cambios propuestos y hará clic en **Merge pull request** para 
que el código quede oficialmente integrado en la rama principal.
