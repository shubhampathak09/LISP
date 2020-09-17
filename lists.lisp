;fundamental data structure
; implemented bu linked lists
;manipulate :- car,cdr,cons,list,append,last,member,reverse
; useful predicares null,listp,equal

(write (list 'a 'b 'c '1 '2 '3))
; symbols by default get printed in upper case
; ' has nothihing to do with upper casre generation
; a quote ' always prevents evaluation
; for lower case convert the string to lower case using string-downcase
;example

;(write (string-downcase (symbol-name 'abcderf)))

 (setq dog (list 'a 'b 'c '1 '2 '3))

 (write dog)

 (setq cat '(A B C D E F))

 (write cat)

(setq rat '(A B (1 2 3) C))

(write rat)

