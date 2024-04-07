# AssociativeArray Package
## Author
**Garikai Gijima**
The `AssociativeArray` class provided in this package offers a flexible and dynamic implementation of an associative array in Java. Associative arrays, also known as maps or dictionaries, store key-value pairs and provide efficient (not in this case but usually) retrieval and modification operations based on the keys.

## Overview

An associative array maps keys to values, allowing you to retrieve a value based on its associated key. This implementation provides methods for adding, retrieving, updating, and removing key-value pairs, as well as utility methods for checking the presence of keys and obtaining the size of the array. Additionally, the class offers functionality for cloning the array and generating a string representation of its contents.

## Features

- **Dynamic Sizing**: The array dynamically resizes itself to accommodate a growing number of key-value pairs, ensuring efficient memory usage.
- **Exception Handling**: It handles exceptions gracefully, such as `NullKeyException` when attempting to set a null key and `KeyNotFoundException` when trying to retrieve a non-existent key.
- **Cloning**: Allows for the creation of a deep copy of the associative array.
- **String Representation**: Provides a human-readable string representation of the associative array for debugging and logging purposes.

## Acknowledgments
- Sam Rebelsky provided the skeleton code for all classes.