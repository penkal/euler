(defn fib-seq []
  ((fn rfib [a b] 
       (cons a (lazy-seq (rfib b (+ a b)))))
    0 1))

(defn problem_2 []
  (reduce + (filter even? (take 34 (fib-seq)))))

