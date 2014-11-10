package com.maggioni.Map.Loop;

public class Worker {
       private int id;
        private String name;
        private int salary;

        public Worker(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public final int getId() {
            return id;
        }

        public final String getName() {
            return name;
        }

        public final int getSalary() {
            return salary;
        }

        public final void setId(int id) {
            this.id = id;
        }

        public final void setName(String name) {
            this.name = name;
        }

        public final void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Worker [id=" + id + ", name=" + name + ", salary=" + salary
                    + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + (int) (salary ^ (salary >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Worker other = (Worker) obj;
            if (id != other.id) {
                return false;
            }
            if (name == null) {
                if (other.name != null) {
                    return false;
                }
            } else if (!name.equals(other.name)) {
                return false;
            }
            if (salary != other.salary) {
                return false;
            }
            return true;
        }
}
