import {Rectangle} from "./rectangle";
import {Shape} from "./shape";

const rectangle = new Rectangle(5, 5, 10, 20);
const shape = new Shape(4,5)
console.log(shape.toString())
console.log(rectangle.toString());
console.log(rectangle.area());