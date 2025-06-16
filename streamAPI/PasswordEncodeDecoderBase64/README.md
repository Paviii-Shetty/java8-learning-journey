# Password Encoder and Decoder with Base64 and SHA-256

This Java program demonstrates how to encode and decode passwords using Base64 encoding, and how to encrypt passwords securely using SHA-256 hashing combined with Base64 encoding.

---

## Overview

The program covers three main concepts:

1. **Base64 Encoding and Decoding**  
   Base64 is a binary-to-text encoding scheme that converts binary data into a readable ASCII string format. It is commonly used to encode data so it can be safely transmitted over media designed to handle textual data.

2. **Password Encryption using SHA-256**  
   SHA-256 is a cryptographic hash function that converts input data into a fixed-size 256-bit (32-byte) hash value. It is a one-way function, meaning the original data cannot be retrieved from the hash, providing secure password storage.

3. **Combining Encryption with Encoding**  
   Since the raw output of SHA-256 contains non-readable (binary) data, Base64 encoding is applied to convert it into a readable string suitable for transmission or storage.

---

## How It Works

### Base64 Encoding and Decoding

- The password string is converted into bytes.
- The bytes are encoded to Base64, producing an encoded string.
- The encoded string is then decoded back to the original password bytes and converted to a string.

### SHA-256 Encryption

- The password is hashed using SHA-256, producing a byte array representing the encrypted password.
- This byte array contains binary data which may include unreadable characters.

### Encoding Encrypted Password

- To make the encrypted password readable and safe for network transmission, the binary SHA-256 hash bytes are encoded again using Base64.
