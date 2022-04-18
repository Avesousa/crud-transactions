import TypeClient from "./typeClient";
import TypeTransaction from "./typeTransaction";

export default interface Transaction {
  id: number;
  type: TypeTransaction;
  date: string;
  dateConciliation: string;
  amountEntry: number;
  amountLoss: number;
  difTypeExchange: number;
  commissionPrePaid: number;
  commissionCollector: number;
  amountBalance: number;
  typeClient: TypeClient;
  fileName: string;
}


