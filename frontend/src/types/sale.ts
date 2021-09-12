import { Seller } from "./seller"

export type Sale = {
    id: number,
    visited: number,
    deals: number,
    amount: number,
    date: string,
    seller: Seller
    }

export type SalePage ={
    content?: Sale[],
    last: boolean,
    totalPages: number,
    totalElements: number,
    first: boolean,
    numberOfElements?: number,
    size?: number,
    number: number,
    empty?: boolean
}

export type SaleSum = {
    sellerName : string,
    amount : number
}

export type SaleSuccessTax = {
    sellerName : string,
    visited : number,
    deals : number
}