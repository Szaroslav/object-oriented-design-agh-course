rootProject.name = "tasks"
include("src:main:adapter")
findProject(":src:main:adapter")?.name = "adapter"
