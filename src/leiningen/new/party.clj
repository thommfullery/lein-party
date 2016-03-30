(ns leiningen.new.party
  (:require [clojure.java.shell :refer [sh]]
            [leiningen.help :as lhelp]
            [leiningen.core.main :as lmain]
            [clojure.java.io :as io]))

(defn prereqs
  "Check for cordova binary in $PATH"
  []
  ;; Prompt for installation if necessary?
  (println "Checking prerequisites")
  )

(defn ^{:no-project-needed true}
  party
  "Create a ClojureScript based Cordova project."
  []
  (println "Creating project"))
