<div id="header" align="center">
    <h1>jtc4omm</h1>
    <h3>🔃 Java type converters for org.modelmapper</h3>
</div>

<div id="badges" align="center">

[![language](https://img.shields.io/badge/Java%2011-e6892e)](https://github.com/Justedlev/jtc4omm)
[![license](https://img.shields.io/github/license/Justedlev/jtc4omm)](https://github.com/Justedlev/jtc4omm)
[![stars](https://img.shields.io/github/stars/Justedlev/jtc4omm)](https://github.com/Justedlev/jtc4omm/star)
[![issues](https://img.shields.io/github/issues/Justedlev/jtc4omm)](https://github.com/Justedlev/jtc4omm/issues)

</div>

### 🤔 Why?

I was inspired to create __jtc4omm__ (java type converters for org.modelmapper), because I noticed that I often implement converters in my projects, either as a separate module or inside the project itself (I believe that I’m not the only one who encountered this), so What are you looking for, simple converters for one of the powerful tools of [modelmapper](https://modelmapper.org/)

### 🤖 Set

What has already been implemented:

1. Number
   - [BigDecimal2Double](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FBigDecimal2Double.java)
   - [BigDecimal2Float](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FBigDecimal2Float.java)
   - [BigDecimal2Integer](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FBigDecimal2Integer.java)
   - [BigDecimal2Long](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FBigDecimal2Long.java)
   - [Double2BigDecimal](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FDouble2BigDecimal.java)
   - [Float2BigDecimal](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FFloat2BigDecimal.java)
   - [Long2BigDecimal](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FLong2BigDecimal.java)
   - [Integer2BigDecimal](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FInteger2BigDecimal.java)
2. Date and time
   - [DateInstant2LocalDateTime](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FDateInstant2LocalDateTime.java)
   - [DateInstant2Timestamp](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FDateInstant2Timestamp.java)
   - [Instant2LocalDateTime](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FInstant2LocalDateTime.java)
   - [Instant2Timestamp](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FInstant2Timestamp.java)
   - [LocalDate2Timestamp](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FLocalDate2Timestamp.java)
   - [LocalDateTime2Timestamp](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FLocalDateTime2Timestamp.java)
   - [Timestamp2LocalDate](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FTimestamp2LocalDate.java)
   - [Timestamp2LocalDateTime](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FTimestamp2LocalDateTime.java)
3. String
   - [ToLowerCase](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FToLowerCase.java)
   - [ToUpperCase](src%2Fmain%2Fjava%2Fdev%2Fjustedlev%2Fjtc4omm%2FToUpperCase.java)
