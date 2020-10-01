(format t "Hello world!")
(format t "and this is the samw new line!")

; to add a new line use ~%

(format t "~%")

(format t "Hello worrld~%and this is the new line")
;(print ~%)   not able to use with print?
(print "seek and youn shall find")

(defun hello-world(fname lname)
 (format t "hELLO,~A ~A!~%" fname lname) )

  

 
 (hello-world "shubham" "suvan")
 
