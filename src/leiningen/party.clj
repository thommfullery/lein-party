(ns leiningen.party
  (:require [clojure.java.shell :refer [sh]]
            [leiningen.help :as lhelp]
            [leiningen.core.main :as lmain]
            [clojure.java.io :as io]))

(defn add
  "Add Cordova to this project"
  []
  (println "Adding Cordova to this project"))

(defn build
  "Build cordova project. If no argument is provided, builds all platforms"
  []
  (println "Building project"))

(defn ls
  "List configured target platforms and WebView"
  []
  (println "Listing platforms and webviews")
  )

(defn prereqs
  "Check for cordova binary in $PATH"
  []
  (println "Checking prerequisites")
  )

(defn run
  "Run project on Emulator or in Browser"
  []
  (println "Running project")
  )

(defn try
  "Test the Cordova project"
  []
  (println "Testing project")
  )
  
(defn party
  "Cordova Wrapper"
  {:help-arglists '([add build ls prereqs run try])
   :subtasks [#'add #'build #'ls #'prereqs #'run #'try]}
  [project subtask & args]
  (let [options (:party project)]
    (case subtask
      "add" (create) ;;  project options args)
      "build" (build) ;; project options args)
      "prereqs" (prereqs)
      "ls" (ls)
      "run" (run)
      "try" (try)
      (do
        (lmain/info
         "Subtask" (str \" subtask \") "not found."
         (lhelp/subtask-help-for *ns* #'party))
        (lmain/abort)))))
