cmake_minimum_required(VERSION 3.15)
project(deobf)

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -O3 -march=native -pthread")

# Find packages
find_package(CURL REQUIRED)
find_package(nlohmann_json 3.2.0 REQUIRED)
find_package(LibArchive REQUIRED)

add_executable(deobf src/main.cpp)

target_link_libraries(deobf
    CURL::libcurl
    nlohmann_json::nlohmann_json
    ${LibArchive_LIBRARIES}
    pthread
)

target_include_directories(deobf PRIVATE ${LibArchive_INCLUDE_DIRS})

# Install
install(TARGETS deobf DESTINATION bin)
