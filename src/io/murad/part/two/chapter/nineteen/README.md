# Chapter 19
# Input/Output: Exploring java.io

This chapter explores java.io, which provides support for I/O operations. In Chapter 13,
we presented an overview of Java’s I/O system. Here, we will examine the Java I/O
system in greater detail.
As all programmers learn early on, most programs cannot accomplish their goals without
accessing external data. Data is retrieved from an input source. The results of a program are
sent to an output destination. In Java, these sources or destinations are defined very broadly.
For example, a network connection, memory buffer, or disk file can be manipulated by the
Java I/O classes. Although physically different, these devices are all handled by the same
abstraction: the stream. A stream, as explained in Chapter 13, is a logical entity that either
produces or consumes information. A stream is linked to a physical device by the Java I/O
system. All streams behave in the same manner, even if the actual physical devices they are
linked to differ.

---

## The Java I/O Classes and Interfaces
---
## File
---
## Directories
---
## Using FilenameFilter
---
## The listFiles( ) Alternative
---
## Creating Directories
---
## The Closeable and Flushable Interfaces
---
## The Stream Classes
---
## The Byte Streams
---
## InputStream
---
## OutputStream
---
## FileInputStream
---
## FileOutputStream
---
## ByteArrayInputStream
---
## ByteArrayOutputStream
---
## Filtered Byte Streams
---
## Buffered Byte Streams
---
## BufferedInputStream
---
## BufferedOutputStream
---
## PushbackInputStream
---
## SequenceInputStream
---
## PrintStream
---
## DataOutputStream and DataInputStream
---
## RandomAccessFile
---
## The Character Streams
---
## Reader
---
## Writer
---
## FileReader
---
## FileWriter
---
## CharArrayReader
---
## CharArrayWriter
---
## BufferedReader
---
## BufferedWriter
---
## PushbackReader
---
## PrintWriter
---
## The Console Class
---
## Using Stream I/O
---
## Improving wc( ) Using a StreamTokenizer
---
## Serialization
---
## Serializable
---
## Externalizable
---
## ObjectOutput
---
## ObjectOutputStream
---
## ObjectInput
---
## ObjectInputStream
---
## A Serialization Example
---
## Stream Benefits
---