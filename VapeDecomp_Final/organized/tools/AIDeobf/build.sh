
#!/bin/bash
set -e

# Make a build directory
mkdir -p build
cd build

# Run CMake
cmake ..

# Build the project
cmake --build . --config Release

# Move the executable to parent directory
mv deobf ../../

echo "Build complete. Executable moved to ../deobf"
