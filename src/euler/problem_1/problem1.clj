(defn mod_3_or_5 [n]
  (or
    (= (mod n 3) 0)
    (= (mod n 5) 0)
  )
)

(defn sum_of_multiples [numbers]
  (reduce + (filter mod_3_or_5 numbers))
)

(defn problem_1 []
  (sum_of_multiples (range 1 1000))
)

