Define the requirement for an implementation of WebIDL to be compliant.

# WebIDL Specification Version #

[WebIDL 2010-10-21](http://www.w3.org/TR/2010/WD-WebIDL-20101021)

# Introduction #

This page lists the requirements extracted from the WebIDL Draft specification ( version 20101021). Those requirements are dispatched along three categories :

  * Core
  * Ecma Script mapping
  * Java mapping

Those requirements apply to the grammar elements defined in the webidl specification.

# Core #
  1. An IDL fragment is a sequence of definitions that matches the Definitions non-terminal (module,interface,exception,typedef,implementstatement)
  1. Language binding  agnostic extended attribute ( webidl core  ó interface def language)
  1. No non-module declaration at outermost-scope.
  1. Every module, interface, exception, typedef, constant, attribute and exception field has an identifier,
  1. If the identifier begins with `“_”`, the identifier is the string whithout that `“_”`.
  1. module, interface, exception and typedef have a qualified name.
  1. Qualified name of interface, exception, typedef must be unique. Multiple module declarations can have the same qualified name. When a subsequent module declaration for the same qualified name is encountered, this effectively re-opens the module for definitions
  1. QualifiedName of outermost scope definitions begins with “::”.
  1. The prefixed name of a module is a scoped name, and a module can be prefixed, if there is a `[Prefix]` extended attribute,  with that value of the prefix extended attribute. If that value does not start with ‘::’, the prefix begin with the enclosing module prefixed name. Otherwise it starts with that value.
  1. Module prefixed name is computed  according that algorithm :
    * If the module has a `[Prefix]` extended attribute whose argument starts with the string “::”, then the prefixed name of the module is a scoped name constructed by concatenating the `[Prefix]` argument, the string “::” and the module’s identifier.
    * Otherwise, if the module has a `[Prefix]` extended attribute whose argument does not start with the string “::”, then the prefixed name of the module is a scoped name constructed by concatenating the prefixed name of the module’s enclosing module (or “::” if there is no enclosing module), the string “::”, the `[Prefix]` argument, the string “::” and the module’s identifier.
    * Otherwise, if the qualified name of the module is “::dom”, then the prefixed name of the module is the scoped name “::org::w3c::dom”.
    * Otherwise, if the module has no enclosing module, then the prefixed name of the module is a scoped name constructed by concatenating the string “::org::w3c::dom::” and the module’s identifier.
    * Otherwise, the prefixed name of the module is a scoped name constructed by concatenating the prefixed name of the module’s enclosing module and the module’s identifier.
  1. If the qualified name of a module is ::dom, then the prefixed name of the module is “::org::w3c::dom”
  1. Every scoped name in the ScopedNameList MUST resolve to an interface whose definition occurs before the definition of the inheriting interface
  1. An interface MUST NOT be declared such that its inheritance hierarchy has a cycle
  1. The identifier of a constant MUST NOT be the same as the identifier of another interface member defined on the same interface or another exception member defined on the same exception.
  1. The value of a constant can be one of the two Boolean (“true” or “false”),  an integer terminal, or a float terminal.
  1. Constant can appears on interface or exception.
  1. The value of the integer (resp. float) terminal MUST NOT lie outside the valid range of values for its type (section 3.7)
  1. GetRaise(resp SetRaise) declare possible exception  that can be thrown when retrieving (resp assigning) the attribute value
  1. If an operation has no identifier, then it MUST be declared to be a special operation using one of the special keywords.
  1. The identifier of a regular operation MUST NOT be the same as the identifier of an attribute or constant identifier defined on the same interface
  1. An argument MUST NOT be declared with the "..." terminal unless it is the final argument in the operation’s argument list.
  1. The final argument of a variadic operation (“…”)  is also considered to be an optional argument
  1. An argument MUST NOT be declared to be optional unless any subsequent arguments to the operation are also optional.
  1. The “omittable” keyword MUST NOT appear on an operation that has no identifier.
  1. A given special keyword MUST NOT appear twice on a operation.
  1. On a given interface there must exists AT MOST one stringifier and at most one of each variety of getter,setter,creator,deleter,
  1. Special operation declared using operation must not be variadic nor have any optional arguments
  1. Stringifier declared with operation MUST de declared to take zero argument and return a DOMString.
  1. If the the “stringifier” keyword is declared using an operation with no identifier, then the  return type and argument list can be omitted.
  1. The “stringifier” keyword MUST NOT be placed on an  attribute unless it is declared to be of type DOMString.
  1. Index getter and deleter MUST be declared to take a single unsigned long argument.  Index creator and setter MUST be declared to take two argument, the first one is an unsigned long
  1. Name getter and deleter MUST be declared to take a single DOMString argument.  Name creator and setter MUST be declared to take two argument, the first one is a DOMString
  1. For each pair of entry in a effective overload set  at least one of the following must be true :
    * The type list length of the two entries is different, or
    * There exist an index I such that the type in the two type lists at index I are distinguishable (cf distinguishable type table in webidl)
  1. The two scoped name of an implement statement must resolve, with respect to the enclosing module, to an interface or a typedef.
  1. The type name of boolean is “Boolean” (First Upper Case).
  1. The type name of any  is “Any”
  1. Octet is an unsigned integer range from 0 to 255, and type name is “Octet”.
  1. Short is a signed integer range `[−32768, 32767]`, and type name is “Short”.
  1. Unsigned short  is an unsigned integer type range `[0, 65535]`, type names is “UnsignedShort”
  1. Long is a signed integer type that range `[−2147483648, 2147483647]`, type name is “Long”.
  1. Unsigned long is an unsigned type that range `[0, 4294967295]`, type name is “UnsignedLong”.
  1. Long Long is a signed integer that range `[−9223372036854775808, 9223372036854775807]`., type name is “LongLong”.
  1. Unsigned long long is an unsigned integer type that range `[0, 18446744073709551615]`, type name is  “UnsignedLongLong”.
  1. Float is a floating point numeric type, corresponds to single-precision 32 bit IEEE 754 floating point numbers, type name is Float.
  1. Double is floating point numeric type, corresponds to double-precision 64 bit IEEE 754 floating point numbers.
  1. DOMString is sequences of 16 bit unsigned integer code units (to be interpreted as UTF-16 encoded strings `[RFC2781]`), type name is “String”.
  1. Object is the set of possible reference + null, type name is “Object”.
  1. Only types that do not already allow null can have a nullable type created from them (eg: it excludes obj ect and interface)
  1. Nullable type name is inner type name + “OrNull”.
  1. There is no way to define constant of type DOMString or `Sequence<T>` or object or array
  1. Type name of sequence type T is the type T name + “Sequence”
  1. Sequence of type T are always passed by value.
  1. unsigned precedes only short, long
  1. void only type an operation
  1. Array of type T are always passed by reference
  1. Array can be either fixed length or variable length, default is fixed length
  1. Type name of an array of T is T type name + “Array”

# ECMA Binding #

  1. If the callback extended attribute appears on an interface that has any attributes,  has zero operation or has multiple operation with differents identifiers, then the extended attribute must take no argument.
  1. Constructor extended attribute must take zero argument, or an empty argument list or an argument list.
  1. The identifier of a NamedConstructor is an identifier of the relevant namespace object of the interface.
  1. The identifier of a NamedConstructor must not be the same as that used by a NamedConstructor on another interface and it must not be the same as an identifier of an interface (or exception) that as an interface object (or exception interface object).

  1. The NamespaceObject extended attribute must not be specified on a module if is specified on one of its ancestor module.
  1. If the NoInterfaceObject extended attribute is specified on an interface, then the Constructor extended attribute must not also be specified on that interface.
  1. The OverrideBuiltins must not appears on an interface that does not define a name getter.
  1. The PrototypeRoot extended attribute must not appears on an interface that inherits from another interface.
  1. An interface hierarchy must not have multiple path from one interface to another that has the PrototypeRoot extended attribute.
  1. `[PutForward]` appears on read only attribute declaration whose type is an interface type.
  1. A is the attribute on whitch putforward is applied to, I the interface of A, J the type interface, and N the putforward identifier. There must be an attribute B on J with identifier N.
  1. There must not exists a cycle in a chain of forwarded (PutForward) assignments.
  1. An attribute with PutForward must not also be declared with `[Replaceable]`.
  1. `[Replaceable]` appears on read only attribute.
  1. An attribute with the `[READ_ERROR]` must not be declared with the `[Replaceable]`.
  1. The `[TreatNullAs]` MUST NOT be specified on an operation return value, operation argument or attribute whose type is not DOMString.
  1. The `[TreatUndefinedAs=EmptyString]` (resp. `[ReatUndefinedAs=Null]` )  must not be specified on an operation return value, an operation argument, an attribute whose type is not DOMString? Or  DOMString (resp. DOMString?).

# JAVA binding #

  1. If an identifier is a JAVA reserved keyword it is escaped by prefixing the value by `“_”` to be compliant.