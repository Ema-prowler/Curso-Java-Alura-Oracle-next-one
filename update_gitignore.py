import os

# Define el contenido a agregar
gitignore_content_to_add = """
# Ignora todos los archivos por defecto
*

# Permite el contenido de la carpeta 'out'
!/out/
!/out/**

# Ignora todo el contenido de la carpeta '.idea'
.idea/
.idea/**

# Permite la carpeta 'src' y su contenido
!/src/
!/src/**
"""

# Define el contenido a eliminar
gitignore_content_to_remove = [
    "### IntelliJ IDEA ###",
    "!**/src/main/**/out/",
    "!**/src/test/**/out/",
    "### Eclipse ###",
    ".apt_generated",
    ".classpath",
    ".factorypath",
    ".project",
    ".settings",
    ".springBeans",
    ".sts4-cache",
    "bin/",
    "!**/src/main/**/bin/",
    "!**/src/test/**/bin/",
    "### NetBeans ###",
    "/nbproject/private/",
    "/nbbuild/",
    "/dist/",
    "/nbdist/",
    "/.nb-gradle/",
    "### VS Code ###",
    ".vscode/",
    "### Mac OS ###",
    ".DS_Store"
]

# Obtener el directorio de trabajo actual
root_directory = os.getcwd()

def update_gitignore(project_path):
    gitignore_path = os.path.join(project_path, '.gitignore')
    if os.path.exists(gitignore_path):
        with open(gitignore_path, 'r') as file:
            lines = file.readlines()

        # Eliminar las líneas no deseadas
        with open(gitignore_path, 'w') as file:
            for line in lines:
                if not any(unwanted in line for unwanted in gitignore_content_to_remove):
                    file.write(line)
        
        # Volver a abrir el archivo y agregar el nuevo contenido si no está presente
        with open(gitignore_path, 'r') as file:
            content = file.read()
        if gitignore_content_to_add.strip() not in content:
            with open(gitignore_path, 'a') as file:
                file.write('\n' + gitignore_content_to_add.strip())
            print(f"Añadido contenido a {gitignore_path}")
        else:
            print(f"El contenido ya está presente en {gitignore_path}")
    else:
        with open(gitignore_path, 'w') as file:
            file.write(gitignore_content_to_add.strip())
        print(f"Creado y añadido contenido a {gitignore_path}")

def main():
    for subdir in os.listdir(root_directory):
        project_path = os.path.join(root_directory, subdir)
        if os.path.isdir(project_path):
            print(f"Procesando proyecto: {project_path}")
            update_gitignore(project_path)

if __name__ == "__main__":
    main()
